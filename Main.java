/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
package com.sistemagestionventas;

/**
 *
 * @author SEBA
 
public class Main {
    
}*/
package com.sistemagestionventas;

import javax.swing.*;
import java.awt.*;

public class Main {
//BUENO AQUI ES DONDE INICIA TODO Y EN DONDE MAS TIEMPO ME LLEVO TRABAJAR
    //LOS DISEÑOS Y LA PROGRAMACION SON COSAS QUE MUCHAS VECES NO LO PODEMOS PLASMAR
    // EN ESTA CLASE INCLUYE NO SOLO EL MENU SINO LOS ATRIBUTOS Y CONTRUCTORES
    private static BaseDatos baseDatos = new BaseDatos(); //ATRIBUTOS

    public static void main(String[] args) { // EN ADELANTE CONSTRUCTORES
        // Presentación inicial
        showWelcomeMessage();

        // Menú principal
        boolean exit = false;

        while (!exit) {
            int choice = showMainMenu();
            switch (choice) {
                case 1:
                    adminLogin();
                    break;
                case 2:
                    userLogin();
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema de Patagonia S.A. ¡Hasta luego!");
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }

    private static void showWelcomeMessage() {
        ImageIcon icon = new ImageIcon("C:\\Users\\cualq\\Downloads\\Descargas");
        // Mensaje de bienvenida
        JOptionPane.showMessageDialog(null, "Bienvenidos a Patagonia S.A.", "Patagonia S.A. ventas", JOptionPane.INFORMATION_MESSAGE, icon);
    }

    private static int showMainMenu() {             // Menú de inicio
        String[] options = {"Administrador", "Usuario", "Salir"};
        int choice = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú Principal",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        return choice + 1;
    }

    private static void adminLogin() { // Login de administrador
        JTextField userField = new JTextField(15);
        JPasswordField passField = new JPasswordField(15);
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel(new ImageIcon("path_to_logo/admin.png"))); //lo que si se va a generar error es muchas veces la imagen que carge
        panel.add(new JLabel());
        panel.add(new JLabel("Usuario:"));
        panel.add(userField);
        panel.add(new JLabel("Contraseña:"));
        panel.add(passField);

        int option = JOptionPane.showConfirmDialog(null, panel, "Inicio de sesión - Administrador", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (option == JOptionPane.OK_OPTION) {
            String username = userField.getText();
            String password = new String(passField.getPassword());
            if (baseDatos.autenticarUsuario(username, password, true)) {
                adminMenu();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void userLogin() {
        JTextField userField = new JTextField(15);
        JPasswordField passField = new JPasswordField(15);
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel(new ImageIcon("path_to_logo/user.png")));
        panel.add(new JLabel());
        panel.add(new JLabel("Usuario:"));
        panel.add(userField);
        panel.add(new JLabel("Contraseña:"));
        panel.add(passField);

        int option = JOptionPane.showConfirmDialog(null, panel, "Inicio de sesión - Usuario", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (option == JOptionPane.OK_OPTION) {
            String username = userField.getText();
            String password = new String(passField.getPassword());
            if (baseDatos.autenticarUsuario(username, password, false)) {
                userMenu();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void adminMenu() {
        String[] options = {"Agregar Cliente", "Ver Stock", "Agregar Usuario", "Regresar"};
        int choice = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú Administrador",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        switch (choice) {
            case 0:
                addClient();
                break;
            case 1:
                viewStock();
                break;
            case 2:
                addUser();
                break;
            case 3:
                break;
            default:
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
        }
    }

    private static void userMenu() {
        String[] options = {"Buscar Producto", "Ver Pedido", "Regresar"};
        int choice = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú Usuario",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        switch (choice) {
            case 0:
                searchProduct();
                break;
            case 1:
                viewOrder();
                break;
            case 2:
                break;
            default:
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
        }
    }

    private static void addClient() {
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        String direccion = JOptionPane.showInputDialog("Ingrese la dirección del cliente:");
        String gmail = JOptionPane.showInputDialog("Ingrese el Gmail del cliente:");
        baseDatos.agregarCliente(apellido, nombre, direccion, gmail);
        JOptionPane.showMessageDialog(null, "Cliente agregado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void addUser() { // Aquí se debería insertar el nuevo usuario en la base de datos.
        String username = JOptionPane.showInputDialog("Ingrese el nombre de usuario:");
        String password = JOptionPane.showInputDialog("Ingrese la contraseña:");
        boolean isAdmin = JOptionPane.showConfirmDialog(null, "¿Es administrador?", "Tipo de usuario", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        baseDatos.agregarUsuario(username, password, isAdmin);
        JOptionPane.showMessageDialog(null, "Usuario agregado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void viewStock() {
        // Implementar la lógica para ver el stock
    }

    private static void searchProduct() {
        // Implementar la lógica para buscar productos
    }

    private static void viewOrder() {
        // Implementar la lógica para ver pedidos
    }
}
