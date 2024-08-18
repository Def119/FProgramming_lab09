@main def main()={

    var inttype:Int=>String = (int:Int) => {
        int match {
            case x if x < 1 => "input is less than equal to zero\n";
            case x if x %2 == 0 => "Even Number\n";
            case _ => "Odd Number\n";
        }
    }

    var int: Int=231;
    println(s"actual interest of $int is : " + inttype(int));

}

