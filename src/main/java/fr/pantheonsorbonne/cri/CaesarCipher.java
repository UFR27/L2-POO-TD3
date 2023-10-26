package fr.pantheonsorbonne.cri;

import edu.duke.*;


public class CaesarCipher
{
    public static String encrypt(String input, int key)
    {
        // creer un stringbuilder avec un message (encrypted)
        StringBuilder encrypted = new StringBuilder(input);
        // ecrire l'alphabet
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // calculer l'alphabet decalé (shiftedAlphabet)

        //compter de 0 à length d'encrypted (nom de la variable = i)

        // regarder le caractere a l'index i de l'encrypted (l'appeller currChar)
        // trouver l'index de currChar dans l'alphabet (l'appeller idx)
       // si currCar est dans l'alphabett
       
        {
            //obtenir le idx ieme caractere de l'alphabet decalé, l'appeller newChar
            //Remplacer le ieme caractère de l'encrypte avec newChar
            
            
        }  
        
        // Sinon, ne rien faire
        
        //votre réponse est contenue dans la variable encryted
        
        return "";
    }

    

    public static void main(String args[])
    {
        int key = 17;
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encrypt(message, key);
        System.out.println(encrypted);
        String decrypted = encrypt(encrypted, 26-key);
        System.out.println(decrypted);
    }
}