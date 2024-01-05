package designPattern.observer.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        jFrame = new JFrame();
        JButton jButton = new JButton("정말 해도 될까?");
        jButton.addActionListener(new AngelListner()); //리스너(옵저버) 추가
        jButton.addActionListener(new DevilListner());
        jFrame.getContentPane().add(BorderLayout.CENTER, jButton);

        // 프로그램이 종료되지 않도록 설정
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 프레임 크기 설정
        jFrame.setSize(300, 200);

        // 프레임을 보이도록 설정
        jFrame.setVisible(true);
    }

    private class AngelListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("안 돼. 나중에 후회할꺼야!!");
        }
    }

    private class DevilListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("당연하지. 그냥 저질러 버려!");
        }
    }
}
