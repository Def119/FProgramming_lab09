@main def main()={

    var interest = (dep:Double) => {
        dep match {
            case x if x <20000 => x*.02;
            case x if x < 200000 => x*.4;
            case x if x < 2000000 => x*.55;
            case _ => dep*.65;
        }
    }

    var dep: Double=100000;
    println(s"actual interest of $dep is : " + interest(dep));

}

