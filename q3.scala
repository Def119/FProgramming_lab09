@main def main()={

    val toUpper:String =>String = (text:String) => text.map(char => char.toUpper);
    val toLower:String =>String = (text:String) => text.map(char => char.toLower);

    val formatNames= (text:String,start:Int,end:Int,format:String=>String) => text.slice(0,start-1) + format(text.slice(start,end)) + text.slice(end, text.length);
    // println(text.slice(0,start-1) + format(text.slice(start,end)) + text.slice(end, text.length() 


    var text:String ="AmMaasd asdasd aDSAs aDS Ml:D as ampciepca";
    var text2="adamsdklasld asldmasldlaksm ddalm";
    var text3 ="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

    println(s"$text is : " + toUpper(text));
    println(s"$text is : " + toLower(text));
    println(s"$text2 is : " + formatNames(text2,3,15,toUpper));
    println(s"$text3 is : " + formatNames(text3,3,15,toUpper));

}

