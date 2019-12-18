fun main(args: Array<String>) {
    var player: Int
    var numberG: Int
    var count= 0

    print("Entrez un nombre à faire deviner entre 0 et 10: ")
    do{
        numberG = readLine()!!.toInt()
        
        if(numberG<0){print("Le nombre n'est pas compris entre 0 et 10! Veuillez re-entrer un nombre: ");}
        if(numberG>10){print("Le nombre n'est pas compris entre 0 et 10! Veuillez re-entrer un nombre: ");}
        //if(numberG!=Int){print("Vous n'avez pas entrer un nombre! Veuillez entrer un nombre entre 0 et 10: ");}
        
    }while(numberG<0 || numberG>10)

    println("Trouvez le bon nombre compris entre 0 et 10! ")

    do{
        player = readLine()!!.toInt()

        if(player<numberG){count++; print("Le nombre est plus grand! Veuillez re-entrer un nombre: ");}
        if(player>numberG){count++; print("Le nombre est plus petit! Veuillez re-entrer un nombre: ");}
        else{count++; print("Félicitaions! Vous avez trouvé le bon nombre en $count essai(s)!");}

    }while (player!=numberG)
}