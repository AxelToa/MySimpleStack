package deqo.axto.MySimpleStack;

import java.util.EmptyStackException;

public interface SimpleStack {

    //Vérifie si le Stack est vide
    public boolean isEmpty();

    //Retourne le nombre d'Items dans le Stack
    public int getSize();

    //Push un item au-dessus du Stack (valeur NULL autorisée)
    public void push(Item item);

    /* Dans les deux cas suivants,
    EmptyStackException si l'Item est vide*/

    //Renvoie l'élement le plus au-dessus du Stack sans le supprimer
    //du Stack
    public Item peek() throws EmptyStackException;

    //Renvoie l'élement le plus au-dessus du Stack et le supprime
    // du Stack
    public Item pop() throws EmptyStackException;
}
