/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jtreeexample;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class JTreeExample {

    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("Ejemplo de JTree");

        // Crear el nodo raíz
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Raíz");

        // Crear nodos para el primer nivel
        DefaultMutableTreeNode level1Node1 = new DefaultMutableTreeNode("Nivel 1 - Nodo 1");
        DefaultMutableTreeNode level1Node2 = new DefaultMutableTreeNode("Nivel 1 - Nodo 2");

        // Crear nodos para el segundo nivel
        DefaultMutableTreeNode level2Node1 = new DefaultMutableTreeNode("Nivel 2 - Nodo 1");
        DefaultMutableTreeNode level2Node2 = new DefaultMutableTreeNode("Nivel 2 - Nodo 2");

        // Agregar nodos al segundo nivel
        level1Node1.add(level2Node1);
        level1Node1.add(level2Node2);

        // Agregar nodos al primer nivel
        rootNode.add(level1Node1);
        rootNode.add(level1Node2);

        // Crear un modelo de árbol con el nodo raíz
        DefaultTreeModel treeModel = new DefaultTreeModel(rootNode);

        // Crear una instancia de JTree con el modelo de árbol
        JTree tree = new JTree(treeModel);

        // Agregar el JTree a un JScrollPane
        JScrollPane scrollPane = new JScrollPane(tree);

        // Agregar el JScrollPane al JFrame
        frame.add(scrollPane);

        // Establecer el tamaño de la ventana
        frame.setSize(300, 400);

        // Establecer la operación de cierre predeterminada
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hacer que la ventana sea visible
        frame.setVisible(true);
    }
}
