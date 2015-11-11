package debakesh.com.twentynine.player;

/**
 * Created by debarghy on 10/29/2015.
 */

class RepClassifier {

    public static double classify(Object [] i)
            throws Exception {

        double p = Double.NaN;
        p = RepClassifier.N43852873082(i);
        return p;
    }
    static double N43852873082(Object []i) {
        double p = Double.NaN;
    /* IS_TEAM_WINNING_NOW */
        if (i[8] == null) {
            p = -0.3165643740629685;
        } else if (i[8].equals("N")) {
            p = RepClassifier.N255f155d3083(i);
        } else if (i[8].equals("Y")) {
            p = RepClassifier.N205f37343400(i);
        } else if (i[8].equals("X")) {
            p = RepClassifier.N3ce629693527(i);
        }
        return p;
    }
    static double N255f155d3083(Object []i) {
        double p = Double.NaN;
    /* IS_WINNING_CARD */
        if (i[4] == null) {
            p = -1.6113617557114588;
        } else if (i[4].equals("NO")) {
            p = RepClassifier.N2e19dcd23084(i);
        } else if (i[4].equals("YES")) {
            p = RepClassifier.N4a4eba813342(i);
        }
        return p;
    }
    static double N2e19dcd23084(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = -2.774239026559558;
        } else if (((Double)i[0]).doubleValue() < 2.5) {
            p = RepClassifier.N27b4fa2a3085(i);
        } else if (true) {
            p = RepClassifier.N354d8d6f3190(i);
        }
        return p;
    }
    static double N27b4fa2a3085(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -1.8417375255421529;
        } else if (((Double)i[12]).doubleValue() < 0.5) {
            p = RepClassifier.N61de28313086(i);
        } else if (true) {
            p = RepClassifier.N5b11d4293104(i);
        }
        return p;
    }
    static double N61de28313086(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -3.164750957854406;
        } else if (((Double)i[2]).doubleValue() < 2.5) {
            p = RepClassifier.N3c762caa3087(i);
        } else if (true) {
            p = RepClassifier.N512172303092(i);
        }
        return p;
    }
    static double N3c762caa3087(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -4.592631578947368;
        } else if (((Double)i[2]).doubleValue() < 1.5) {
            p = RepClassifier.N5ce998ba3088(i);
        } else if (true) {
            p = RepClassifier.N5c8c5ca73089(i);
        }
        return p;
    }
    static double N5ce998ba3088(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -5.144578313253012;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = -5.390243902439025;
        } else if (true) {
            p = -5.064;
        }
        return p;
    }
    static double N5c8c5ca73089(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -4.164485981308411;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = -4.2626970227670755;
        } else if (true) {
            p = RepClassifier.N4c8368a73090(i);
        }
        return p;
    }
    static double N4c8368a73090(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -4.052104208416834;
        } else if (((Double)i[9]).doubleValue() < 1.5) {
            p = -4.338235294117647;
        } else if (true) {
            p = RepClassifier.N411d1ee13091(i);
        }
        return p;
    }
    static double N411d1ee13091(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -3.9449035812672175;
        } else if (((Double)i[9]).doubleValue() < 2.5) {
            p = -3.869369369369369;
        } else if (true) {
            p = -4.0638297872340425;
        }
        return p;
    }
    static double N512172303092(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -2.744265344079355;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = RepClassifier.N6f7675d73093(i);
        } else if (true) {
            p = RepClassifier.N112405353095(i);
        }
        return p;
    }
    static double N6f7675d73093(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -3.2875457875457874;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = RepClassifier.N3867eece3094(i);
        } else if (true) {
            p = -3.203205495134516;
        }
        return p;
    }
    static double N3867eece3094(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -3.6247139588100685;
        } else if (((Double)i[1]).doubleValue() < 4.5) {
            p = -3.8802395209580838;
        } else if (true) {
            p = -3.466666666666667;
        }
        return p;
    }
    static double N112405353095(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -2.4662605435801312;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = -2.7176749703440093;
        } else if (true) {
            p = RepClassifier.N4bce45d33096(i);
        }
        return p;
    }
    static double N4bce45d33096(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -2.4043795620437955;
        } else if (((Double)i[9]).doubleValue() < 1.5) {
            p = -2.219269102990033;
        } else if (true) {
            p = RepClassifier.N17ca59b03097(i);
        }
        return p;
    }
    static double N17ca59b03097(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -2.4438540559688273;
        } else if (((Double)i[2]).doubleValue() < 5.5) {
            p = -2.4097633136094676;
        } else if (true) {
            p = RepClassifier.N105cc4193098(i);
        }
        return p;
    }
    static double N105cc4193098(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -2.454587796925943;
        } else if (((Double)i[9]).doubleValue() < 7.5) {
            p = RepClassifier.N2160668a3099(i);
        } else if (true) {
            p = -2.057142857142857;
        }
        return p;
    }
    static double N2160668a3099(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -2.461174242424242;
        } else if (((Double)i[9]).doubleValue() < 5.5) {
            p = RepClassifier.N18b95fa83100(i);
        } else if (true) {
            p = RepClassifier.N5d7b82d63101(i);
        }
        return p;
    }
    static double N18b95fa83100(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -2.440940673436665;
        } else if (((Double)i[9]).doubleValue() < 3.5) {
            p = -2.492917847025496;
        } else if (true) {
            p = -2.281045751633987;
        }
        return p;
    }
    static double N5d7b82d63101(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -2.6182572614107884;
        } else if (((Double)i[2]).doubleValue() < 7.5) {
            p = RepClassifier.N2bf1e96c3102(i);
        } else if (true) {
            p = -2.779220779220779;
        }
        return p;
    }
    static double N2bf1e96c3102(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -2.542682926829268;
        } else if (((Double)i[1]).doubleValue() < 6.5) {
            p = RepClassifier.N9878eae3103(i);
        } else if (true) {
            p = -2.6444444444444444;
        }
        return p;
    }
    static double N9878eae3103(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -2.504201680672269;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = -2.75;
        } else if (true) {
            p = -2.2542372881355934;
        }
        return p;
    }
    static double N5b11d4293104(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.5443879335862867;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = RepClassifier.N5a7d90af3105(i);
        } else if (true) {
            p = RepClassifier.N3af08d223144(i);
        }
        return p;
    }
    static double N5a7d90af3105(Object []i) {
        double p = Double.NaN;
    /* IS_BIGGEST_SUIT_REMAINING */
        if (i[5] == null) {
            p = -2.254624591947769;
        } else if (i[5].equals("N")) {
            p = RepClassifier.N7e63b8053106(i);
        } else if (i[5].equals("Y")) {
            p = RepClassifier.N4f64d9503132(i);
        }
        return p;
    }
    static double N7e63b8053106(Object []i) {
        double p = Double.NaN;
    /* IS_ROUND_SUIT */
        if (i[7] == null) {
            p = -2.0634197617379115;
        } else if (i[7].equals("Y")) {
            p = RepClassifier.N4ba4bb993107(i);
        } else if (i[7].equals("N")) {
            p = RepClassifier.N474e9dbb3117(i);
        }
        return p;
    }
    static double N4ba4bb993107(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -2.555721765145849;
        } else if (((Double)i[11]).doubleValue() < 3.5) {
            p = RepClassifier.N1e419e583108(i);
        } else if (true) {
            p = -0.7666666666666667;
        }
        return p;
    }
    static double N1e419e583108(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -2.6180340557275543;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = -3.0656084656084657;
        } else if (true) {
            p = RepClassifier.N288f8dd73109(i);
        }
        return p;
    }
    static double N288f8dd73109(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_ME */
        if (i[10] == null) {
            p = -2.359975594874924;
        } else if (((Double)i[10]).doubleValue() < 1.5) {
            p = RepClassifier.N4b4fbb533110(i);
        } else if (true) {
            p = -1.4172661870503598;
        }
        return p;
    }
    static double N4b4fbb533110(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -2.4473333333333334;
        } else if (((Double)i[9]).doubleValue() < 2.5) {
            p = RepClassifier.N2559b9d03111(i);
        } else if (true) {
            p = -2.822289156626506;
        }
        return p;
    }
    static double N2559b9d03111(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -2.1495215311004783;
        } else if (((Double)i[1]).doubleValue() < 1.5) {
            p = -1.900473933649289;
        } else if (true) {
            p = RepClassifier.N37f8507d3112(i);
        }
        return p;
    }
    static double N37f8507d3112(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -2.4033816425120773;
        } else if (((Double)i[12]).doubleValue() < 5.0) {
            p = RepClassifier.N634d82603113(i);
        } else if (true) {
            p = RepClassifier.N55ee38793114(i);
        }
        return p;
    }
    static double N634d82603113(Object []i) {
        double p = Double.NaN;
    /* IS_TRUMP_SUIT */
        if (i[6] == null) {
            p = -1.7672413793103448;
        } else if (i[6].equals("X")) {
            p = -0.4528301886792453;
        } else if (i[6].equals("N")) {
            p = -2.9836065573770494;
        } else if (i[6].equals("Y")) {
            p = 0.5;
        }
        return p;
    }
    static double N55ee38793114(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -2.651006711409396;
        } else if (((Double)i[1]).doubleValue() < 3.5) {
            p = RepClassifier.N3d919c2d3115(i);
        } else if (true) {
            p = -3.676470588235294;
        }
        return p;
    }
    static double N3d919c2d3115(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -2.518939393939394;
        } else if (((Double)i[11]).doubleValue() < 2.5) {
            p = RepClassifier.N481f485a3116(i);
        } else if (true) {
            p = -2.016949152542373;
        }
        return p;
    }
    static double N481f485a3116(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -2.6634146341463416;
        } else if (((Double)i[11]).doubleValue() < 1.5) {
            p = -2.5054945054945055;
        } else if (true) {
            p = -2.789473684210526;
        }
        return p;
    }
    static double N474e9dbb3117(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -1.91283459162663;
        } else if (((Double)i[12]).doubleValue() < 1.5) {
            p = RepClassifier.N634748db3118(i);
        } else if (true) {
            p = -1.5783696238977867;
        }
        return p;
    }
    static double N634748db3118(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -2.4963893249607536;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = RepClassifier.N5206c06a3119(i);
        } else if (true) {
            p = RepClassifier.N5a12b143128(i);
        }
        return p;
    }
    static double N5206c06a3119(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -2.921608040201005;
        } else if (((Double)i[2]).doubleValue() < 2.5) {
            p = RepClassifier.N60e90fe83120(i);
        } else if (true) {
            p = RepClassifier.N5379f50b3121(i);
        }
        return p;
    }
    static double N60e90fe83120(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -3.38265306122449;
        } else if (((Double)i[2]).doubleValue() < 1.5) {
            p = -3.6964285714285716;
        } else if (true) {
            p = -3.1184210526315788;
        }
        return p;
    }
    static double N5379f50b3121(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -2.4742574257425742;
        } else if (((Double)i[1]).doubleValue() < 4.5) {
            p = RepClassifier.Na217e2f3122(i);
        } else if (true) {
            p = RepClassifier.N467e3efe3124(i);
        }
        return p;
    }
    static double Na217e2f3122(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -2.7656903765690375;
        } else if (((Double)i[9]).doubleValue() < 7.5) {
            p = -2.9779411764705883;
        } else if (true) {
            p = RepClassifier.N6e40fa913123(i);
        }
        return p;
    }
    static double N6e40fa913123(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -2.4854368932038833;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = -2.963636363636364;
        } else if (true) {
            p = -1.9375;
        }
        return p;
    }
    static double N467e3efe3124(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -2.383916990920882;
        } else if (((Double)i[9]).doubleValue() < 6.5) {
            p = RepClassifier.N5ab34a973125(i);
        } else if (true) {
            p = RepClassifier.N329f6a773127(i);
        }
        return p;
    }
    static double N5ab34a973125(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -2.5210843373493974;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = RepClassifier.N5be297e83126(i);
        } else if (true) {
            p = -2.3500967117988396;
        }
        return p;
    }
    static double N5be297e83126(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -3.122448979591837;
        } else if (((Double)i[9]).doubleValue() < 5.5) {
            p = -3.360655737704918;
        } else if (true) {
            p = -1.96;
        }
        return p;
    }
    static double N329f6a773127(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.5327102803738317;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = -2.1320754716981134;
        } else if (true) {
            p = -0.9444444444444444;
        }
        return p;
    }
    static double N5a12b143128(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.788284518828452;
        } else if (((Double)i[2]).doubleValue() < 2.5) {
            p = RepClassifier.N45862ec53129(i);
        } else if (true) {
            p = RepClassifier.Na14ac4a3130(i);
        }
        return p;
    }
    static double N45862ec53129(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.9521178637200736;
        } else if (((Double)i[2]).doubleValue() < 1.5) {
            p = -1.3827751196172249;
        } else if (true) {
            p = -2.308383233532934;
        }
        return p;
    }
    static double Na14ac4a3130(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.651840490797546;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = RepClassifier.N4311a3ad3131(i);
        } else if (true) {
            p = -1.9174311926605505;
        }
        return p;
    }
    static double N4311a3ad3131(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -1.3846153846153846;
        } else if (((Double)i[9]).doubleValue() < 1.5) {
            p = -1.702247191011236;
        } else if (true) {
            p = -1.0;
        }
        return p;
    }
    static double N4f64d9503132(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -3.76;
        } else if (((Double)i[2]).doubleValue() < 2.5) {
            p = RepClassifier.N3be0367f3133(i);
        } else if (true) {
            p = RepClassifier.N333c82023136(i);
        }
        return p;
    }
    static double N3be0367f3133(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -4.635431918008785;
        } else if (((Double)i[11]).doubleValue() < 2.5) {
            p = RepClassifier.N14b9abb53134(i);
        } else if (true) {
            p = -3.1491228070175437;
        }
        return p;
    }
    static double N14b9abb53134(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -4.933216168717047;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = RepClassifier.N5a7b7e443135(i);
        } else if (true) {
            p = -5.512195121951219;
        }
        return p;
    }
    static double N5a7b7e443135(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -4.6987654320987655;
        } else if (((Double)i[12]).doubleValue() < 3.5) {
            p = -0.7105263157894737;
        } else if (true) {
            p = -5.111716621253406;
        }
        return p;
    }
    static double N333c82023136(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -2.980443285528031;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = RepClassifier.N9d509d43137(i);
        } else if (true) {
            p = RepClassifier.N5160324f3139(i);
        }
        return p;
    }
    static double N9d509d43137(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -1.376425855513308;
        } else if (((Double)i[9]).doubleValue() < 3.5) {
            p = RepClassifier.N5068ef583138(i);
        } else if (true) {
            p = -3.6153846153846154;
        }
        return p;
    }
    static double N5068ef583138(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -0.9866071428571429;
        } else if (((Double)i[1]).doubleValue() < 3.5) {
            p = -0.1839080459770115;
        } else if (true) {
            p = -1.4963503649635037;
        }
        return p;
    }
    static double N5160324f3139(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -3.8174603174603177;
        } else if (((Double)i[12]).doubleValue() < 1.5) {
            p = -4.635036496350365;
        } else if (true) {
            p = RepClassifier.N61b96f33140(i);
        }
        return p;
    }
    static double N61b96f33140(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -3.5122615803814714;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = RepClassifier.N2721b44d3141(i);
        } else if (true) {
            p = RepClassifier.N600633df3143(i);
        }
        return p;
    }
    static double N2721b44d3141(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -3.342412451361868;
        } else if (((Double)i[9]).doubleValue() < 3.5) {
            p = RepClassifier.N30248dde3142(i);
        } else if (true) {
            p = -3.9420289855072466;
        }
        return p;
    }
    static double N30248dde3142(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -3.122340425531915;
        } else if (((Double)i[1]).doubleValue() < 6.5) {
            p = -2.6144578313253013;
        } else if (true) {
            p = -3.5238095238095237;
        }
        return p;
    }
    static double N600633df3143(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -3.9090909090909096;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = -4.204081632653061;
        } else if (true) {
            p = -3.6721311475409837;
        }
        return p;
    }
    static double N3af08d223144(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -1.1682650751183372;
        } else if (((Double)i[12]).doubleValue() < 2.5) {
            p = RepClassifier.N1059c5ed3145(i);
        } else if (true) {
            p = RepClassifier.N7a76039f3174(i);
        }
        return p;
    }
    static double N1059c5ed3145(Object []i) {
        double p = Double.NaN;
    /* IS_BIGGEST_SUIT_REMAINING */
        if (i[5] == null) {
            p = -1.562883026911804;
        } else if (i[5].equals("N")) {
            p = RepClassifier.N407e0453146(i);
        } else if (i[5].equals("Y")) {
            p = -2.441081081081081;
        }
        return p;
    }
    static double N407e0453146(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -1.4394468925695183;
        } else if (((Double)i[9]).doubleValue() < 1.5) {
            p = RepClassifier.N554ea3d13147(i);
        } else if (true) {
            p = RepClassifier.Ne7fb0cf3150(i);
        }
        return p;
    }
    static double N554ea3d13147(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -1.1254512635379061;
        } else if (((Double)i[12]).doubleValue() < 1.5) {
            p = -1.271585557299843;
        } else if (true) {
            p = RepClassifier.N6be9adc73148(i);
        }
        return p;
    }
    static double N6be9adc73148(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -0.9278131634819533;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = -1.47;
        } else if (true) {
            p = RepClassifier.N35c17bfa3149(i);
        }
        return p;
    }
    static double N35c17bfa3149(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -0.7816711590296496;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = -0.6455026455026455;
        } else if (true) {
            p = -0.9230769230769231;
        }
        return p;
    }
    static double Ne7fb0cf3150(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -1.503014799926914;
        } else if (((Double)i[12]).doubleValue() < 1.5) {
            p = RepClassifier.N2e0fdafa3151(i);
        } else if (true) {
            p = RepClassifier.N150c94ab3155(i);
        }
        return p;
    }
    static double N2e0fdafa3151(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -1.5815768930523029;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = -1.7052524222335543;
        } else if (true) {
            p = RepClassifier.N8aedd693152(i);
        }
        return p;
    }
    static double N8aedd693152(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.178036605657238;
        } else if (((Double)i[2]).doubleValue() < 5.5) {
            p = -1.3125;
        } else if (true) {
            p = RepClassifier.N368e792d3153(i);
        }
        return p;
    }
    static double N368e792d3153(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.129251700680272;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = -1.00625;
        } else if (true) {
            p = RepClassifier.N45045efb3154(i);
        }
        return p;
    }
    static double N45045efb3154(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.199288256227758;
        } else if (((Double)i[2]).doubleValue() < 7.5) {
            p = -1.2246376811594204;
        } else if (true) {
            p = -1.1748251748251748;
        }
        return p;
    }
    static double N150c94ab3155(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -1.4338715218138096;
        } else if (((Double)i[9]).doubleValue() < 2.5) {
            p = RepClassifier.N6bb746f63156(i);
        } else if (true) {
            p = RepClassifier.N77fe07053164(i);
        }
        return p;
    }
    static double N6bb746f63156(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -1.6847635726795096;
        } else if (((Double)i[1]).doubleValue() < 6.5) {
            p = -1.4902912621359223;
        } else if (true) {
            p = RepClassifier.N2e350dbc3157(i);
        }
        return p;
    }
    static double N2e350dbc3157(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -1.7275641025641026;
        } else if (((Double)i[11]).doubleValue() < 1.5) {
            p = RepClassifier.N49217d073158(i);
        } else if (true) {
            p = -2.255813953488372;
        }
        return p;
    }
    static double N49217d073158(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.702127659574468;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = RepClassifier.N38f901443159(i);
        } else if (true) {
            p = RepClassifier.N5d7e8e493163(i);
        }
        return p;
    }
    static double N38f901443159(Object []i) {
        double p = Double.NaN;
    /* IS_ROUND_SUIT */
        if (i[7] == null) {
            p = -2.019607843137255;
        } else if (i[7].equals("Y")) {
            p = RepClassifier.N6928605b3160(i);
        } else if (i[7].equals("N")) {
            p = RepClassifier.N2dfd49933162(i);
        }
        return p;
    }
    static double N6928605b3160(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -2.2203389830508473;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = -2.264367816091954;
        } else if (true) {
            p = RepClassifier.N6ff6c82f3161(i);
        }
        return p;
    }
    static double N6ff6c82f3161(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -2.1946308724832213;
        } else if (((Double)i[2]).doubleValue() < 5.5) {
            p = -1.9811320754716981;
        } else if (true) {
            p = -2.3125;
        }
        return p;
    }
    static double N2dfd49933162(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.3428571428571427;
        } else if (((Double)i[2]).doubleValue() < 5.5) {
            p = -1.425;
        } else if (true) {
            p = -1.2333333333333334;
        }
        return p;
    }
    static double N5d7e8e493163(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -1.536626916524702;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = -1.7259786476868328;
        } else if (true) {
            p = -1.3627450980392157;
        }
        return p;
    }
    static double N77fe07053164(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -1.2719050310910118;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = RepClassifier.N2e900e653165(i);
        } else if (true) {
            p = RepClassifier.N33acf7c83170(i);
        }
        return p;
    }
    static double N2e900e653165(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -1.4181078331637844;
        } else if (((Double)i[1]).doubleValue() < 3.5) {
            p = -1.176056338028169;
        } else if (true) {
            p = RepClassifier.N69667bf53166(i);
        }
        return p;
    }
    static double N69667bf53166(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.5164520743919885;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = RepClassifier.N4043ac563167(i);
        } else if (true) {
            p = -1.3687150837988826;
        }
        return p;
    }
    static double N4043ac563167(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -1.6715542521994136;
        } else if (((Double)i[1]).doubleValue() < 4.5) {
            p = RepClassifier.N47025d743168(i);
        } else if (true) {
            p = -1.4742857142857142;
        }
        return p;
    }
    static double N47025d743168(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.8795180722891567;
        } else if (((Double)i[2]).doubleValue() < 5.5) {
            p = -2.152941176470588;
        } else if (true) {
            p = RepClassifier.N69cf90d73169(i);
        }
        return p;
    }
    static double N69cf90d73169(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -1.5925925925925926;
        } else if (((Double)i[9]).doubleValue() < 7.5) {
            p = -1.816326530612245;
        } else if (true) {
            p = -1.25;
        }
        return p;
    }
    static double N33acf7c83170(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -1.089058524173028;
        } else if (((Double)i[9]).doubleValue() < 6.5) {
            p = RepClassifier.N6e50dcf73171(i);
        } else if (true) {
            p = -1.3962264150943395;
        }
        return p;
    }
    static double N6e50dcf73171(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.0668485675306958;
        } else if (((Double)i[2]).doubleValue() < 5.5) {
            p = RepClassifier.N3becc5b43172(i);
        } else if (true) {
            p = RepClassifier.N2eb0a3363173(i);
        }
        return p;
    }
    static double N3becc5b43172(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -0.9371428571428572;
        } else if (((Double)i[9]).doubleValue() < 4.5) {
            p = -1.1071428571428572;
        } else if (true) {
            p = -0.2571428571428571;
        }
        return p;
    }
    static double N2eb0a3363173(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.10752688172043;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = -1.292817679558011;
        } else if (true) {
            p = -1.0185676392572944;
        }
        return p;
    }
    static double N7a76039f3174(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -0.9918398951694561;
        } else if (((Double)i[2]).doubleValue() < 5.5) {
            p = RepClassifier.N1229cf423175(i);
        } else if (true) {
            p = RepClassifier.N210a248d3187(i);
        }
        return p;
    }
    static double N1229cf423175(Object []i) {
        double p = Double.NaN;
    /* IS_ROUND_SUIT */
        if (i[7] == null) {
            p = -1.3164861612515042;
        } else if (i[7].equals("Y")) {
            p = RepClassifier.N4fb569d63176(i);
        } else if (i[7].equals("N")) {
            p = -0.8635321100917431;
        }
        return p;
    }
    static double N4fb569d63176(Object []i) {
        double p = Double.NaN;
    /* IS_TRUMP_SUIT */
        if (i[6] == null) {
            p = -1.477569331158238;
        } else if (i[6].equals("X")) {
            p = RepClassifier.N64b7da053177(i);
        } else if (i[6].equals("N")) {
            p = RepClassifier.N6c5f43ea3183(i);
        } else if (i[6].equals("Y")) {
            p = -0.8793103448275862;
        }
        return p;
    }
    static double N64b7da053177(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -1.3333333333333333;
        } else if (((Double)i[12]).doubleValue() < 5.0) {
            p = RepClassifier.N2e9757f73178(i);
        } else if (true) {
            p = RepClassifier.N7298ceb83179(i);
        }
        return p;
    }
    static double N2e9757f73178(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = 0.08759124087591241;
        } else if (((Double)i[11]).doubleValue() < 1.5) {
            p = 0.2616822429906542;
        } else if (true) {
            p = -0.5333333333333333;
        }
        return p;
    }
    static double N7298ceb83179(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -1.5154349859681946;
        } else if (((Double)i[11]).doubleValue() < 2.5) {
            p = RepClassifier.N1687f2e43180(i);
        } else if (true) {
            p = -1.0791666666666666;
        }
        return p;
    }
    static double N1687f2e43180(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -1.6417370325693608;
        } else if (((Double)i[11]).doubleValue() < 1.5) {
            p = RepClassifier.N4cba65c33181(i);
        } else if (true) {
            p = -1.7576470588235293;
        }
        return p;
    }
    static double N4cba65c33181(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -1.5198019801980198;
        } else if (((Double)i[1]).doubleValue() < 1.5) {
            p = -1.592741935483871;
        } else if (true) {
            p = RepClassifier.N5886ab4c3182(i);
        }
        return p;
    }
    static double N5886ab4c3182(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -1.4038461538461537;
        } else if (((Double)i[1]).doubleValue() < 2.5) {
            p = -1.1875;
        } else if (true) {
            p = -1.75;
        }
        return p;
    }
    static double N6c5f43ea3183(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -1.6531986531986531;
        } else if (((Double)i[1]).doubleValue() < 4.5) {
            p = RepClassifier.N45668c573184(i);
        } else if (true) {
            p = RepClassifier.N37dc618f3186(i);
        }
        return p;
    }
    static double N45668c573184(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -1.2625298329355608;
        } else if (((Double)i[9]).doubleValue() < 6.5) {
            p = -0.9353846153846154;
        } else if (true) {
            p = RepClassifier.N5a6d6d453185(i);
        }
        return p;
    }
    static double N5a6d6d453185(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -2.393617021276596;
        } else if (((Double)i[1]).doubleValue() < 3.5) {
            p = -3.048780487804878;
        } else if (true) {
            p = -1.8867924528301887;
        }
        return p;
    }
    static double N37dc618f3186(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -1.8660598179453836;
        } else if (((Double)i[11]).doubleValue() < 1.5) {
            p = -1.606818181818182;
        } else if (true) {
            p = -2.2127659574468086;
        }
        return p;
    }
    static double N210a248d3187(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -0.9116969922020052;
        } else if (((Double)i[9]).doubleValue() < 2.5) {
            p = -0.7073251574411668;
        } else if (true) {
            p = RepClassifier.N507f10cf3188(i);
        }
        return p;
    }
    static double N507f10cf3188(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.0776476921006592;
        } else if (((Double)i[2]).doubleValue() < 7.5) {
            p = RepClassifier.N61c958c03189(i);
        } else if (true) {
            p = -0.944121915820029;
        }
        return p;
    }
    static double N61c958c03189(Object []i) {
        double p = Double.NaN;
    /* IS_ROUND_SUIT */
        if (i[7] == null) {
            p = -1.1563636363636363;
        } else if (i[7].equals("Y")) {
            p = -1.253104106972302;
        } else if (i[7].equals("N")) {
            p = -0.9582790091264668;
        }
        return p;
    }
    static double N354d8d6f3190(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -3.479542659620434;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = RepClassifier.N4513f9073191(i);
        } else if (true) {
            p = RepClassifier.Nb85886a3282(i);
        }
        return p;
    }
    static double N4513f9073191(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -4.316097211725866;
        } else if (((Double)i[2]).doubleValue() < 2.5) {
            p = RepClassifier.N6d4270023192(i);
        } else if (true) {
            p = RepClassifier.N439347183227(i);
        }
        return p;
    }
    static double N6d4270023192(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -4.957916833266693;
        } else if (((Double)i[2]).doubleValue() < 1.5) {
            p = RepClassifier.N46e62a323193(i);
        } else if (true) {
            p = RepClassifier.N5b1ba52c3206(i);
        }
        return p;
    }
    static double N46e62a323193(Object []i) {
        double p = Double.NaN;
    /* IS_BIGGEST_SUIT_REMAINING */
        if (i[5] == null) {
            p = -5.289521818656912;
        } else if (i[5].equals("N")) {
            p = RepClassifier.N1f19e1743194(i);
        } else if (i[5].equals("Y")) {
            p = -5.042816365366318;
        }
        return p;
    }
    static double N1f19e1743194(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -5.38292507204611;
        } else if (((Double)i[12]).doubleValue() < 4.5) {
            p = RepClassifier.N4598f8513195(i);
        } else if (true) {
            p = -6.091428571428572;
        }
        return p;
    }
    static double N4598f8513195(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -5.335255670895809;
        } else if (((Double)i[9]).doubleValue() < 3.5) {
            p = RepClassifier.N3b2452803196(i);
        } else if (true) {
            p = RepClassifier.N1e7e3b603199(i);
        }
        return p;
    }
    static double N3b2452803196(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -5.238257899231426;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = -5.331081081081081;
        } else if (true) {
            p = RepClassifier.N4c64586c3197(i);
        }
        return p;
    }
    static double N4c64586c3197(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = -5.143350604490501;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = RepClassifier.N1ca612d53198(i);
        } else if (true) {
            p = -5.118236472945892;
        }
        return p;
    }
    static double N1ca612d53198(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -5.3;
        } else if (((Double)i[12]).doubleValue() < 0.5) {
            p = -5.458333333333333;
        } else if (true) {
            p = -5.0625;
        }
        return p;
    }
    static double N1e7e3b603199(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -5.414685314685315;
        } else if (((Double)i[12]).doubleValue() < 1.5) {
            p = RepClassifier.N7d7ca7d3200(i);
        } else if (true) {
            p = RepClassifier.N699e45d33201(i);
        }
        return p;
    }
    static double N7d7ca7d3200(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -5.361522198731501;
        } else if (((Double)i[1]).doubleValue() < 3.5) {
            p = -5.651785714285714;
        } else if (true) {
            p = -5.322541966426859;
        }
        return p;
    }
    static double N699e45d33201(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -5.518595041322314;
        } else if (((Double)i[9]).doubleValue() < 6.5) {
            p = RepClassifier.N4582c28f3202(i);
        } else if (true) {
            p = RepClassifier.N13f5f7723204(i);
        }
        return p;
    }
    static double N4582c28f3202(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -5.6728110599078345;
        } else if (((Double)i[12]).doubleValue() < 2.5) {
            p = RepClassifier.N2a4854643203(i);
        } else if (true) {
            p = -6.175675675675675;
        }
        return p;
    }
    static double N2a4854643203(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -5.4125874125874125;
        } else if (((Double)i[9]).doubleValue() < 4.5) {
            p = -5.22972972972973;
        } else if (true) {
            p = -5.608695652173913;
        }
        return p;
    }
    static double N13f5f7723204(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -5.393258426966292;
        } else if (((Double)i[9]).doubleValue() < 7.5) {
            p = -5.131868131868132;
        } else if (true) {
            p = RepClassifier.N8de98023205(i);
        }
        return p;
    }
    static double N8de98023205(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -5.528409090909091;
        } else if (((Double)i[1]).doubleValue() < 3.5) {
            p = -5.3;
        } else if (true) {
            p = -6.017857142857143;
        }
        return p;
    }
    static double N5b1ba52c3206(Object []i) {
        double p = Double.NaN;
    /* IS_BIGGEST_SUIT_REMAINING */
        if (i[5] == null) {
            p = -4.752468836004533;
        } else if (i[5].equals("N")) {
            p = RepClassifier.N3398215f3207(i);
        } else if (i[5].equals("Y")) {
            p = RepClassifier.N49062173216(i);
        }
        return p;
    }
    static double N3398215f3207(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -4.351153039832285;
        } else if (((Double)i[11]).doubleValue() < 1.5) {
            p = RepClassifier.Nf6a1e393208(i);
        } else if (true) {
            p = RepClassifier.N1fd4de6e3215(i);
        }
        return p;
    }
    static double Nf6a1e393208(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -4.3748953974895395;
        } else if (((Double)i[12]).doubleValue() < 2.5) {
            p = RepClassifier.N7308895e3209(i);
        } else if (true) {
            p = RepClassifier.N7dc35f73211(i);
        }
        return p;
    }
    static double N7308895e3209(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -4.308895405669599;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = -4.444897959183673;
        } else if (true) {
            p = RepClassifier.N753c70d63210(i);
        }
        return p;
    }
    static double N753c70d63210(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -4.245093346098612;
        } else if (((Double)i[12]).doubleValue() < 0.5) {
            p = -4.181883537023724;
        } else if (true) {
            p = -4.371060171919771;
        }
        return p;
    }
    static double N7dc35f73211(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -4.767441860465116;
        } else if (((Double)i[1]).doubleValue() < 4.5) {
            p = RepClassifier.N581878e33212(i);
        } else if (true) {
            p = -5.217105263157895;
        }
        return p;
    }
    static double N581878e33212(Object []i) {
        double p = Double.NaN;
    /* IS_ROUND_SUIT */
        if (i[7] == null) {
            p = -4.579670329670329;
        } else if (i[7].equals("Y")) {
            p = RepClassifier.N6f6d48c73213(i);
        } else if (i[7].equals("N")) {
            p = RepClassifier.N79413f3c3214(i);
        }
        return p;
    }
    static double N6f6d48c73213(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -4.21978021978022;
        } else if (((Double)i[9]).doubleValue() < 2.5) {
            p = -4.814814814814815;
        } else if (true) {
            p = -3.96875;
        }
        return p;
    }
    static double N79413f3c3214(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -4.6996336996337;
        } else if (((Double)i[12]).doubleValue() < 4.5) {
            p = -4.432;
        } else if (true) {
            p = -4.925675675675675;
        }
        return p;
    }
    static double N1fd4de6e3215(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -3.982683982683983;
        } else if (((Double)i[12]).doubleValue() < 6.5) {
            p = -3.658119658119658;
        } else if (true) {
            p = -4.315789473684211;
        }
        return p;
    }
    static double N49062173216(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -5.401101228293096;
        } else if (((Double)i[12]).doubleValue() < 3.5) {
            p = RepClassifier.N1be29323217(i);
        } else if (true) {
            p = RepClassifier.N410e7e8d3224(i);
        }
        return p;
    }
    static double N1be29323217(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -4.898716119828816;
        } else if (((Double)i[1]).doubleValue() < 4.5) {
            p = -4.118367346938776;
        } else if (true) {
            p = RepClassifier.N71f65ee63218(i);
        }
        return p;
    }
    static double N71f65ee63218(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -5.317982456140351;
        } else if (((Double)i[1]).doubleValue() < 6.5) {
            p = RepClassifier.N4868d9183219(i);
        } else if (true) {
            p = RepClassifier.N3f68cdae3221(i);
        }
        return p;
    }
    static double N4868d9183219(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -4.931818181818182;
        } else if (((Double)i[9]).doubleValue() < 2.5) {
            p = RepClassifier.N4fef9ad83220(i);
        } else if (true) {
            p = -5.275;
        }
        return p;
    }
    static double N4fef9ad83220(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -4.735714285714286;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = -4.984615384615385;
        } else if (true) {
            p = -4.52;
        }
        return p;
    }
    static double N3f68cdae3221(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -5.677966101694915;
        } else if (((Double)i[12]).doubleValue() < 1.5) {
            p = -5.88135593220339;
        } else if (true) {
            p = RepClassifier.N7caab5cb3222(i);
        }
        return p;
    }
    static double N7caab5cb3222(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = -5.47457627118644;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = -5.125;
        } else if (true) {
            p = RepClassifier.N7284035f3223(i);
        }
        return p;
    }
    static double N7284035f3223(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -5.714285714285714;
        } else if (((Double)i[9]).doubleValue() < 2.5) {
            p = -5.605263157894737;
        } else if (true) {
            p = -5.84375;
        }
        return p;
    }
    static double N410e7e8d3224(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -5.613253012048193;
        } else if (((Double)i[9]).doubleValue() < 1.5) {
            p = RepClassifier.N38f2cebf3225(i);
        } else if (true) {
            p = -5.750677506775068;
        }
        return p;
    }
    static double N38f2cebf3225(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = -5.503253796095445;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = -5.31151832460733;
        } else if (true) {
            p = RepClassifier.N11df30873226(i);
        }
        return p;
    }
    static double N11df30873226(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -5.638888888888889;
        } else if (((Double)i[11]).doubleValue() < 2.5) {
            p = -5.66270783847981;
        } else if (true) {
            p = -5.554621848739496;
        }
        return p;
    }
    static double N439347183227(Object []i) {
        double p = Double.NaN;
    /* IS_ROUND_SUIT */
        if (i[7] == null) {
            p = -3.891920459800489;
        } else if (i[7].equals("Y")) {
            p = RepClassifier.N715ba3f13228(i);
        } else if (i[7].equals("N")) {
            p = RepClassifier.N1e1666423270(i);
        }
        return p;
    }
    static double N715ba3f13228(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -4.233308877476156;
        } else if (((Double)i[12]).doubleValue() < 3.5) {
            p = RepClassifier.N5ff21c533229(i);
        } else if (true) {
            p = RepClassifier.Nae65c843240(i);
        }
        return p;
    }
    static double N5ff21c533229(Object []i) {
        double p = Double.NaN;
    /* IS_TRUMP_SUIT */
        if (i[6] == null) {
            p = -3.958821154622527;
        } else if (i[6].equals("X")) {
            p = RepClassifier.N37c144223230(i);
        } else if (i[6].equals("N")) {
            p = RepClassifier.N6eb36e453231(i);
        } else if (i[6].equals("Y")) {
            p = 0.5454545454545454;
        }
        return p;
    }
    static double N37c144223230(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -3.1363636363636362;
        } else if (((Double)i[1]).doubleValue() < 3.5) {
            p = -3.6481481481481484;
        } else if (true) {
            p = -2.642857142857143;
        }
        return p;
    }
    static double N6eb36e453231(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -4.018251273344652;
        } else if (((Double)i[1]).doubleValue() < 4.5) {
            p = -3.5738963531669867;
        } else if (true) {
            p = RepClassifier.N425b1c493232(i);
        }
        return p;
    }
    static double N425b1c493232(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -4.144414168937329;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = -4.416020671834626;
        } else if (true) {
            p = RepClassifier.Nd8480d53233(i);
        }
        return p;
    }
    static double Nd8480d53233(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = -3.946277097078228;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = RepClassifier.N305925133234(i);
        } else if (true) {
            p = RepClassifier.N270802473239(i);
        }
        return p;
    }
    static double N305925133234(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_ME */
        if (i[10] == null) {
            p = -3.8322147651006713;
        } else if (((Double)i[10]).doubleValue() < 0.5) {
            p = RepClassifier.N45edb41b3235(i);
        } else if (true) {
            p = -3.135135135135135;
        }
        return p;
    }
    static double N45edb41b3235(Object []i) {
        double p = Double.NaN;
    /* IS_BIGGEST_SUIT_REMAINING */
        if (i[5] == null) {
            p = -3.9310344827586206;
        } else if (i[5].equals("N")) {
            p = RepClassifier.N5fce41bb3236(i);
        } else if (i[5].equals("Y")) {
            p = RepClassifier.N76e5e0bf3237(i);
        }
        return p;
    }
    static double N5fce41bb3236(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -4.190476190476191;
        } else if (((Double)i[1]).doubleValue() < 6.5) {
            p = -3.5892857142857144;
        } else if (true) {
            p = -4.877551020408164;
        }
        return p;
    }
    static double N76e5e0bf3237(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -3.7564102564102564;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = RepClassifier.Nfed32cd3238(i);
        } else if (true) {
            p = -3.5090909090909093;
        }
        return p;
    }
    static double Nfed32cd3238(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -3.891089108910891;
        } else if (((Double)i[1]).doubleValue() < 6.5) {
            p = -3.6458333333333335;
        } else if (true) {
            p = -4.113207547169812;
        }
        return p;
    }
    static double N270802473239(Object []i) {
        double p = Double.NaN;
    /* IS_BIGGEST_SUIT_REMAINING */
        if (i[5] == null) {
            p = -3.9908256880733943;
        } else if (i[5].equals("N")) {
            p = -3.801980198019802;
        } else if (i[5].equals("Y")) {
            p = -4.0588235294117645;
        }
        return p;
    }
    static double Nae65c843240(Object []i) {
        double p = Double.NaN;
    /* IS_BIGGEST_SUIT_REMAINING */
        if (i[5] == null) {
            p = -4.352569724609718;
        } else if (i[5].equals("N")) {
            p = RepClassifier.N53dfa57f3241(i);
        } else if (i[5].equals("Y")) {
            p = RepClassifier.N2f4f442d3265(i);
        }
        return p;
    }
    static double N53dfa57f3241(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = -4.17804446193193;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = RepClassifier.N35429e933242(i);
        } else if (true) {
            p = RepClassifier.N12f75e6e3250(i);
        }
        return p;
    }
    static double N35429e933242(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -4.337617823479006;
        } else if (((Double)i[12]).doubleValue() < 6.5) {
            p = RepClassifier.N523fb8463243(i);
        } else if (true) {
            p = -3.9971428571428573;
        }
        return p;
    }
    static double N523fb8463243(Object []i) {
        double p = Double.NaN;
    /* IS_TRUMP_SUIT */
        if (i[6] == null) {
            p = -4.397681451612903;
        } else if (i[6].equals("X")) {
            p = RepClassifier.N6a05ccf93244(i);
        } else if (i[6].equals("N")) {
            p = RepClassifier.N44df689b3245(i);
        } else if (i[6].equals("Y")) {
            p = -3.909090909090909;
        }
        return p;
    }
    static double N6a05ccf93244(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -4.365853658536586;
        } else if (((Double)i[11]).doubleValue() < 2.5) {
            p = -4.4520990312163615;
        } else if (true) {
            p = -4.0576923076923075;
        }
        return p;
    }
    static double N44df689b3245(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -4.4766977363515315;
        } else if (((Double)i[12]).doubleValue() < 4.5) {
            p = -4.19672131147541;
        } else if (true) {
            p = RepClassifier.N6548d0953246(i);
        }
        return p;
    }
    static double N6548d0953246(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -4.531001589825119;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = -4.656;
        } else if (true) {
            p = RepClassifier.N4a1aa9f23247(i);
        }
        return p;
    }
    static double N4a1aa9f23247(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -4.4485488126649075;
        } else if (((Double)i[9]).doubleValue() < 4.5) {
            p = -4.673913043478261;
        } else if (true) {
            p = RepClassifier.Ne3cd64c3248(i);
        }
        return p;
    }
    static double Ne3cd64c3248(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -4.376306620209059;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = RepClassifier.N3118eca03249(i);
        } else if (true) {
            p = -4.545454545454546;
        }
        return p;
    }
    static double N3118eca03249(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -4.32579185520362;
        } else if (((Double)i[1]).doubleValue() < 3.5) {
            p = -4.449275362318841;
        } else if (true) {
            p = -4.269736842105263;
        }
        return p;
    }
    static double N12f75e6e3250(Object []i) {
        double p = Double.NaN;
    /* IS_TRUMP_SUIT */
        if (i[6] == null) {
            p = -4.042560931247727;
        } else if (i[6].equals("X")) {
            p = RepClassifier.Ndbd30fb3251(i);
        } else if (i[6].equals("N")) {
            p = RepClassifier.N4b4133d13260(i);
        } else if (i[6].equals("Y")) {
            p = -4.22972972972973;
        }
        return p;
    }
    static double Ndbd30fb3251(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -4.0718771807397065;
        } else if (((Double)i[1]).doubleValue() < 2.5) {
            p = RepClassifier.N655b09b63252(i);
        } else if (true) {
            p = -4.133064516129032;
        }
        return p;
    }
    static double N655b09b63252(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -4.059071729957806;
        } else if (((Double)i[1]).doubleValue() < 1.5) {
            p = RepClassifier.N13d094513253(i);
        } else if (true) {
            p = RepClassifier.N6209cdec3256(i);
        }
        return p;
    }
    static double N13d094513253(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -4.1136638452237;
        } else if (((Double)i[11]).doubleValue() < 1.5) {
            p = -4.043352601156069;
        } else if (true) {
            p = RepClassifier.N3b7cac6b3254(i);
        }
        return p;
    }
    static double N3b7cac6b3254(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -4.164241164241164;
        } else if (((Double)i[11]).doubleValue() < 3.5) {
            p = RepClassifier.N5fa279173255(i);
        } else if (true) {
            p = -4.275862068965517;
        }
        return p;
    }
    static double N5fa279173255(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -4.157079646017699;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = -4.115384615384615;
        } else if (true) {
            p = -4.185185185185185;
        }
        return p;
    }
    static double N6209cdec3256(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -3.9329608938547485;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = RepClassifier.N756cafe03257(i);
        } else if (true) {
            p = RepClassifier.N2bad4ad23258(i);
        }
        return p;
    }
    static double N756cafe03257(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -3.9671052631578947;
        } else if (((Double)i[11]).doubleValue() < 1.5) {
            p = -4.0144927536231885;
        } else if (true) {
            p = -3.927710843373494;
        }
        return p;
    }
    static double N2bad4ad23258(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -3.907766990291262;
        } else if (((Double)i[11]).doubleValue() < 2.5) {
            p = RepClassifier.N670bf4713259(i);
        } else if (true) {
            p = -4.216216216216216;
        }
        return p;
    }
    static double N670bf4713259(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -3.8402366863905324;
        } else if (((Double)i[11]).doubleValue() < 1.5) {
            p = -3.9166666666666665;
        } else if (true) {
            p = -3.764705882352941;
        }
        return p;
    }
    static double N4b4133d13260(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -3.997584541062802;
        } else if (((Double)i[9]).doubleValue() < 4.5) {
            p = RepClassifier.N5b4286f63261(i);
        } else if (true) {
            p = RepClassifier.N60751be33264(i);
        }
        return p;
    }
    static double N5b4286f63261(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -4.030666666666667;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = RepClassifier.N1a78ac963262(i);
        } else if (true) {
            p = RepClassifier.N22e86bd43263(i);
        }
        return p;
    }
    static double N1a78ac963262(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -3.8949152542372882;
        } else if (((Double)i[12]).doubleValue() < 5.5) {
            p = -3.9906103286384975;
        } else if (true) {
            p = -3.6463414634146343;
        }
        return p;
    }
    static double N22e86bd43263(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -4.118681318681319;
        } else if (((Double)i[1]).doubleValue() < 1.5) {
            p = -4.644444444444445;
        } else if (true) {
            p = -4.060975609756097;
        }
        return p;
    }
    static double N60751be33264(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -3.9471544715447155;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = -4.190697674418605;
        } else if (true) {
            p = -3.7581227436823106;
        }
        return p;
    }
    static double N2f4f442d3265(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -5.788025889967638;
        } else if (((Double)i[12]).doubleValue() < 4.5) {
            p = -4.690140845070423;
        } else if (true) {
            p = RepClassifier.N700c514e3266(i);
        }
        return p;
    }
    static double N700c514e3266(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = -6.1155462184873945;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = RepClassifier.N115b32503267(i);
        } else if (true) {
            p = RepClassifier.Nc02d0ad3269(i);
        }
        return p;
    }
    static double N115b32503267(Object []i) {
        double p = Double.NaN;
    /* IS_TRUMP_SUIT */
        if (i[6] == null) {
            p = -5.48;
        } else if (i[6].equals("X")) {
            p = RepClassifier.N59b9999b3268(i);
        } else if (i[6].equals("N")) {
            p = -5.454545454545454;
        } else if (i[6].equals("Y")) {
            p = 7.0;
        }
        return p;
    }
    static double N59b9999b3268(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -5.681159420289855;
        } else if (((Double)i[11]).doubleValue() < 1.5) {
            p = -6.212121212121212;
        } else if (true) {
            p = -5.194444444444445;
        }
        return p;
    }
    static double Nc02d0ad3269(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -6.3418803418803416;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = -6.195121951219512;
        } else if (true) {
            p = -7.0;
        }
        return p;
    }
    static double N1e1666423270(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -3.4907314269291563;
        } else if (((Double)i[12]).doubleValue() < 3.5) {
            p = RepClassifier.N56171e623271(i);
        } else if (true) {
            p = -3.806451612903226;
        }
        return p;
    }
    static double N56171e623271(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -3.463208873613498;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = RepClassifier.N43f7307a3272(i);
        } else if (true) {
            p = -3.418417945690673;
        }
        return p;
    }
    static double N43f7307a3272(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -3.55078485687904;
        } else if (((Double)i[12]).doubleValue() < 1.5) {
            p = RepClassifier.N59ea07113273(i);
        } else if (true) {
            p = RepClassifier.N741ec1c3278(i);
        }
        return p;
    }
    static double N59ea07113273(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -3.610407876230661;
        } else if (((Double)i[9]).doubleValue() < 3.5) {
            p = -3.760869565217391;
        } else if (true) {
            p = RepClassifier.N74634e183274(i);
        }
        return p;
    }
    static double N74634e183274(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -3.594236760124611;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = RepClassifier.N1ae9aaf83275(i);
        } else if (true) {
            p = -3.6598425196850393;
        }
        return p;
    }
    static double N1ae9aaf83275(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -3.5300462249614792;
        } else if (((Double)i[9]).doubleValue() < 6.5) {
            p = RepClassifier.N60673d3f3276(i);
        } else if (true) {
            p = -3.619672131147541;
        }
        return p;
    }
    static double N60673d3f3276(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -3.4505813953488373;
        } else if (((Double)i[1]).doubleValue() < 3.5) {
            p = -3.806451612903226;
        } else if (true) {
            p = RepClassifier.N693c7cad3277(i);
        }
        return p;
    }
    static double N693c7cad3277(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -3.415335463258786;
        } else if (((Double)i[9]).doubleValue() < 4.5) {
            p = -3.728;
        } else if (true) {
            p = -3.2074468085106385;
        }
        return p;
    }
    static double N741ec1c3278(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -3.4368279569892475;
        } else if (((Double)i[9]).doubleValue() < 3.5) {
            p = -2.8076923076923075;
        } else if (true) {
            p = RepClassifier.N50a838663279(i);
        }
        return p;
    }
    static double N50a838663279(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -3.4841040462427744;
        } else if (((Double)i[9]).doubleValue() < 4.5) {
            p = -3.691780821917808;
        } else if (true) {
            p = RepClassifier.N9ff79893280(i);
        }
        return p;
    }
    static double N9ff79893280(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -3.4285714285714284;
        } else if (((Double)i[1]).doubleValue() < 2.5) {
            p = -3.1931818181818183;
        } else if (true) {
            p = RepClassifier.N3aca50f3281(i);
        }
        return p;
    }
    static double N3aca50f3281(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -3.4737991266375547;
        } else if (((Double)i[12]).doubleValue() < 2.5) {
            p = -3.4210526315789473;
        } else if (true) {
            p = -3.6;
        }
        return p;
    }
    static double Nb85886a3282(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -2.8791996117945935;
        } else if (((Double)i[12]).doubleValue() < 3.5) {
            p = RepClassifier.N1affea743283(i);
        } else if (true) {
            p = RepClassifier.N18b3f8173324(i);
        }
        return p;
    }
    static double N1affea743283(Object []i) {
        double p = Double.NaN;
    /* IS_TRUMP_SUIT */
        if (i[6] == null) {
            p = -2.5771394134190437;
        } else if (i[6].equals("X")) {
            p = RepClassifier.N68beeb933284(i);
        } else if (i[6].equals("N")) {
            p = RepClassifier.N29bda02f3286(i);
        } else if (i[6].equals("Y")) {
            p = -0.034482758620689655;
        }
        return p;
    }
    static double N68beeb933284(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -1.8805555555555555;
        } else if (((Double)i[11]).doubleValue() < 1.5) {
            p = RepClassifier.Ne5cbf563285(i);
        } else if (true) {
            p = -0.1836734693877551;
        }
        return p;
    }
    static double Ne5cbf563285(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = -2.147909967845659;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = -1.990990990990991;
        } else if (true) {
            p = -2.539325842696629;
        }
        return p;
    }
    static double N29bda02f3286(Object []i) {
        double p = Double.NaN;
    /* IS_ROUND_SUIT */
        if (i[7] == null) {
            p = -2.5937612047328793;
        } else if (i[7].equals("Y")) {
            p = RepClassifier.N4cf443263287(i);
        } else if (i[7].equals("N")) {
            p = RepClassifier.N3f8d1a303309(i);
        }
        return p;
    }
    static double N4cf443263287(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -2.742056354916067;
        } else if (((Double)i[9]).doubleValue() < 2.5) {
            p = RepClassifier.N5389cb583288(i);
        } else if (true) {
            p = RepClassifier.Nff150493292(i);
        }
        return p;
    }
    static double N5389cb583288(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -2.68705743509048;
        } else if (((Double)i[1]).doubleValue() < 4.5) {
            p = -2.524340770791075;
        } else if (true) {
            p = RepClassifier.N38c468703289(i);
        }
        return p;
    }
    static double N38c468703289(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -2.726207906295754;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = -2.848694725625999;
        } else if (true) {
            p = RepClassifier.N7cbc1b9f3290(i);
        }
        return p;
    }
    static double N7cbc1b9f3290(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -2.6226924808644756;
        } else if (((Double)i[12]).doubleValue() < 1.5) {
            p = RepClassifier.N123f8a5d3291(i);
        } else if (true) {
            p = -2.706703910614525;
        }
        return p;
    }
    static double N123f8a5d3291(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = -2.5440278988666085;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = -2.8986486486486487;
        } else if (true) {
            p = -2.4914914914914914;
        }
        return p;
    }
    static double Nff150493292(Object []i) {
        double p = Double.NaN;
    /* IS_BIGGEST_SUIT_REMAINING */
        if (i[5] == null) {
            p = -2.9181360201511337;
        } else if (i[5].equals("N")) {
            p = RepClassifier.N14ed3e2f3293(i);
        } else if (i[5].equals("Y")) {
            p = -3.475;
        }
        return p;
    }
    static double N14ed3e2f3293(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -2.8885941644562334;
        } else if (((Double)i[1]).doubleValue() < 3.5) {
            p = RepClassifier.N811afce3294(i);
        } else if (true) {
            p = RepClassifier.N6692a1f33295(i);
        }
        return p;
    }
    static double N811afce3294(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -2.449275362318841;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = -3.0;
        } else if (true) {
            p = -2.116279069767442;
        }
        return p;
    }
    static double N6692a1f33295(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -2.9096594857539957;
        } else if (((Double)i[2]).doubleValue() < 7.5) {
            p = RepClassifier.N6364d6703296(i);
        } else if (true) {
            p = RepClassifier.N4796bc3f3308(i);
        }
        return p;
    }
    static double N6364d6703296(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -2.975214489990467;
        } else if (((Double)i[1]).doubleValue() < 4.5) {
            p = RepClassifier.N1e8580753297(i);
        } else if (true) {
            p = RepClassifier.N1b6f23b43298(i);
        }
        return p;
    }
    static double N1e8580753297(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -2.6129032258064515;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = -2.3793103448275863;
        } else if (true) {
            p = -3.0;
        }
        return p;
    }
    static double N1b6f23b43298(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -3.010460251046025;
        } else if (((Double)i[11]).doubleValue() < 2.5) {
            p = RepClassifier.N688184133299(i);
        } else if (true) {
            p = -2.7027027027027026;
        }
        return p;
    }
    static double N688184133299(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -3.0228509249183895;
        } else if (((Double)i[2]).doubleValue() < 5.5) {
            p = -2.886178861788618;
        } else if (true) {
            p = RepClassifier.N2d1308253300(i);
        }
        return p;
    }
    static double N2d1308253300(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -3.072808320950966;
        } else if (((Double)i[11]).doubleValue() < 1.5) {
            p = RepClassifier.N1f27a3da3301(i);
        } else if (true) {
            p = RepClassifier.Ne8ecdb03305(i);
        }
        return p;
    }
    static double N1f27a3da3301(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = -3.1087533156498672;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = RepClassifier.N7d3741093302(i);
        } else if (true) {
            p = RepClassifier.N2c15829b3304(i);
        }
        return p;
    }
    static double N7d3741093302(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -3.084967320261438;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = -2.7142857142857144;
        } else if (true) {
            p = RepClassifier.N19f2e3a03303(i);
        }
        return p;
    }
    static double N19f2e3a03303(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -3.194915254237288;
        } else if (((Double)i[1]).doubleValue() < 6.5) {
            p = -3.046153846153846;
        } else if (true) {
            p = -3.3773584905660377;
        }
        return p;
    }
    static double N2c15829b3304(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -3.125;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = -3.4516129032258065;
        } else if (true) {
            p = -3.0;
        }
        return p;
    }
    static double Ne8ecdb03305(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = -3.027027027027027;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = RepClassifier.N49f6ea613306(i);
        } else if (true) {
            p = RepClassifier.N4717ff1c3307(i);
        }
        return p;
    }
    static double N49f6ea613306(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -2.8076923076923075;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = -2.3225806451612905;
        } else if (true) {
            p = -3.127659574468085;
        }
        return p;
    }
    static double N4717ff1c3307(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -3.1055045871559632;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = -3.2755102040816326;
        } else if (true) {
            p = -2.966666666666667;
        }
        return p;
    }
    static double N4796bc3f3308(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -2.7333333333333334;
        } else if (((Double)i[11]).doubleValue() < 1.5) {
            p = -2.6517857142857144;
        } else if (true) {
            p = -2.8433734939759034;
        }
        return p;
    }
    static double N3f8d1a303309(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -2.5167691230254454;
        } else if (((Double)i[1]).doubleValue() < 2.5) {
            p = RepClassifier.N41564a423310(i);
        } else if (true) {
            p = RepClassifier.N1ccf49ea3313(i);
        }
        return p;
    }
    static double N41564a423310(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -2.2204301075268815;
        } else if (((Double)i[9]).doubleValue() < 7.5) {
            p = -1.9782608695652173;
        } else if (true) {
            p = RepClassifier.N39c1a26b3311(i);
        }
        return p;
    }
    static double N39c1a26b3311(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -2.3;
        } else if (((Double)i[12]).doubleValue() < 2.5) {
            p = RepClassifier.N4b4486283312(i);
        } else if (true) {
            p = -2.6666666666666665;
        }
        return p;
    }
    static double N4b4486283312(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -2.1869158878504673;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = -2.425531914893617;
        } else if (true) {
            p = -2.0;
        }
        return p;
    }
    static double N1ccf49ea3313(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -2.5211212001579155;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = -2.614375910636231;
        } else if (true) {
            p = RepClassifier.N6fb8046b3314(i);
        }
        return p;
    }
    static double N6fb8046b3314(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -2.4761904761904763;
        } else if (((Double)i[12]).doubleValue() < 1.5) {
            p = RepClassifier.N5bde310d3315(i);
        } else if (true) {
            p = -2.5961538461538463;
        }
        return p;
    }
    static double N5bde310d3315(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -2.4605106495568196;
        } else if (((Double)i[9]).doubleValue() < 6.5) {
            p = RepClassifier.N34c489983316(i);
        } else if (true) {
            p = RepClassifier.N4f9451ef3323(i);
        }
        return p;
    }
    static double N34c489983316(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -2.4640883977900554;
        } else if (((Double)i[9]).doubleValue() < 1.5) {
            p = RepClassifier.N52a216f33317(i);
        } else if (true) {
            p = -2.4905459387483355;
        }
        return p;
    }
    static double N52a216f33317(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -2.436988543371522;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = RepClassifier.N7d16cb903318(i);
        } else if (true) {
            p = RepClassifier.N57eadb663319(i);
        }
        return p;
    }
    static double N7d16cb903318(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -2.3365079365079366;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = -2.4875;
        } else if (true) {
            p = -2.1806451612903226;
        }
        return p;
    }
    static double N57eadb663319(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -2.4464339003282602;
        } else if (((Double)i[12]).doubleValue() < 0.5) {
            p = -2.4449367088607596;
        } else if (true) {
            p = RepClassifier.N4772104a3320(i);
        }
        return p;
    }
    static double N4772104a3320(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -2.4712041884816753;
        } else if (((Double)i[2]).doubleValue() < 5.5) {
            p = -2.090909090909091;
        } else if (true) {
            p = RepClassifier.N5a583d93321(i);
        }
        return p;
    }
    static double N5a583d93321(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -2.5850340136054424;
        } else if (((Double)i[2]).doubleValue() < 7.5) {
            p = RepClassifier.N4ea492b63322(i);
        } else if (true) {
            p = -2.3773584905660377;
        }
        return p;
    }
    static double N4ea492b63322(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -2.702127659574468;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = -2.8076923076923075;
        } else if (true) {
            p = -2.5714285714285716;
        }
        return p;
    }
    static double N4f9451ef3323(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -2.2681159420289854;
        } else if (((Double)i[9]).doubleValue() < 7.5) {
            p = -2.171171171171171;
        } else if (true) {
            p = -2.6666666666666665;
        }
        return p;
    }
    static double N18b3f8173324(Object []i) {
        double p = Double.NaN;
    /* IS_ROUND_SUIT */
        if (i[7] == null) {
            p = -3.276965809139607;
        } else if (i[7].equals("Y")) {
            p = RepClassifier.N31a10b933325(i);
        } else if (i[7].equals("N")) {
            p = RepClassifier.N8b6b0b3339(i);
        }
        return p;
    }
    static double N31a10b933325(Object []i) {
        double p = Double.NaN;
    /* IS_TRUMP_SUIT */
        if (i[6] == null) {
            p = -3.315920930564476;
        } else if (i[6].equals("X")) {
            p = -3.3409343715239155;
        } else if (i[6].equals("N")) {
            p = RepClassifier.N5b7a0e333326(i);
        } else if (i[6].equals("Y")) {
            p = -3.164285714285714;
        }
        return p;
    }
    static double N5b7a0e333326(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -3.294909035315701;
        } else if (((Double)i[2]).doubleValue() < 5.5) {
            p = -3.424375;
        } else if (true) {
            p = RepClassifier.N360c379a3327(i);
        }
        return p;
    }
    static double N360c379a3327(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -3.252985225662821;
        } else if (((Double)i[11]).doubleValue() < 3.5) {
            p = RepClassifier.N31f8020c3328(i);
        } else if (true) {
            p = -2.839622641509434;
        }
        return p;
    }
    static double N31f8020c3328(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -3.2715161767815606;
        } else if (((Double)i[12]).doubleValue() < 4.5) {
            p = -3.1848512173128944;
        } else if (true) {
            p = RepClassifier.N8bc7a333329(i);
        }
        return p;
    }
    static double N8bc7a333329(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -3.2980662983425413;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = RepClassifier.N33ce6813330(i);
        } else if (true) {
            p = -3.415349887133183;
        }
        return p;
    }
    static double N33ce6813330(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -3.281712307208058;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = RepClassifier.N54dba19b3331(i);
        } else if (true) {
            p = RepClassifier.N170b62563336(i);
        }
        return p;
    }
    static double N54dba19b3331(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -3.306772908366534;
        } else if (((Double)i[9]).doubleValue() < 4.5) {
            p = -3.4376590330788805;
        } else if (true) {
            p = RepClassifier.N2542316e3332(i);
        }
        return p;
    }
    static double N2542316e3332(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -3.2225859247135844;
        } else if (((Double)i[9]).doubleValue() < 5.5) {
            p = RepClassifier.N4ec4aa173333(i);
        } else if (true) {
            p = RepClassifier.N2aa845a03334(i);
        }
        return p;
    }
    static double N4ec4aa173333(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -3.075268817204301;
        } else if (((Double)i[11]).doubleValue() < 2.5) {
            p = -3.1893687707641196;
        } else if (true) {
            p = -2.591549295774648;
        }
        return p;
    }
    static double N2aa845a03334(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -3.4518828451882846;
        } else if (((Double)i[1]).doubleValue() < 4.5) {
            p = RepClassifier.N2376ee173335(i);
        } else if (true) {
            p = -3.175438596491228;
        }
        return p;
    }
    static double N2376ee173335(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -3.5384615384615383;
        } else if (((Double)i[11]).doubleValue() < 1.5) {
            p = -3.769230769230769;
        } else if (true) {
            p = -3.4755244755244754;
        }
        return p;
    }
    static double N170b62563336(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_ME */
        if (i[10] == null) {
            p = -3.270133456051542;
        } else if (((Double)i[10]).doubleValue() < 0.5) {
            p = -3.3317647058823527;
        } else if (true) {
            p = RepClassifier.N7cf4f6b23337(i);
        }
        return p;
    }
    static double N7cf4f6b23337(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_ME */
        if (i[10] == null) {
            p = -3.2305366591080875;
        } else if (((Double)i[10]).doubleValue() < 2.5) {
            p = RepClassifier.N141929c93338(i);
        } else if (true) {
            p = -3.3768115942028984;
        }
        return p;
    }
    static double N141929c93338(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -3.1919770773638967;
        } else if (((Double)i[2]).doubleValue() < 7.5) {
            p = -3.250467289719626;
        } else if (true) {
            p = -3.130859375;
        }
        return p;
    }
    static double N8b6b0b3339(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -2.7842960288808665;
        } else if (((Double)i[12]).doubleValue() < 4.5) {
            p = -2.6476964769647697;
        } else if (true) {
            p = RepClassifier.N4c5ea09e3340(i);
        }
        return p;
    }
    static double N4c5ea09e3340(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = -2.852503382949932;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = RepClassifier.N17449ec13341(i);
        } else if (true) {
            p = -3.057046979865772;
        }
        return p;
    }
    static double N17449ec13341(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -2.7142857142857144;
        } else if (((Double)i[9]).doubleValue() < 5.5) {
            p = -2.5298013245033113;
        } else if (true) {
            p = -2.810344827586207;
        }
        return p;
    }
    static double N4a4eba813342(Object []i) {
        double p = Double.NaN;
    /* IS_BIGGEST_SUIT_REMAINING */
        if (i[5] == null) {
            p = 2.0806897380437395;
        } else if (i[5].equals("N")) {
            p = RepClassifier.N11c643f03343(i);
        } else if (i[5].equals("Y")) {
            p = RepClassifier.N41fb7f8e3364(i);
        }
        return p;
    }
    static double N11c643f03343(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = 0.45482322130074204;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = RepClassifier.N28a55b063344(i);
        } else if (true) {
            p = RepClassifier.N9a64d293357(i);
        }
        return p;
    }
    static double N28a55b063344(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = 0.23588342440801457;
        } else if (((Double)i[0]).doubleValue() < 2.5) {
            p = RepClassifier.N1ba46a453345(i);
        } else if (true) {
            p = RepClassifier.N79143eed3354(i);
        }
        return p;
    }
    static double N1ba46a453345(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 0.42364450339910464;
        } else if (((Double)i[2]).doubleValue() < 2.5) {
            p = RepClassifier.N248141023346(i);
        } else if (true) {
            p = RepClassifier.N3dcafd943349(i);
        }
        return p;
    }
    static double N248141023346(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 1.308839190628328;
        } else if (((Double)i[12]).doubleValue() < 4.5) {
            p = 0.65748031496063;
        } else if (true) {
            p = RepClassifier.N7fb4fa13347(i);
        }
        return p;
    }
    static double N7fb4fa13347(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = 1.3733905579399142;
        } else if (((Double)i[11]).doubleValue() < 1.5) {
            p = RepClassifier.N50459333348(i);
        } else if (true) {
            p = 1.1761786600496278;
        }
        return p;
    }
    static double N50459333348(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 1.7076761303890642;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = 1.6011695906432748;
        } else if (true) {
            p = 2.65625;
        }
        return p;
    }
    static double N3dcafd943349(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 0.15392103839913468;
        } else if (((Double)i[12]).doubleValue() < 5.5) {
            p = RepClassifier.N13ed327e3350(i);
        } else if (true) {
            p = RepClassifier.N31092333353(i);
        }
        return p;
    }
    static double N13ed327e3350(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 0.4058213449314152;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = 0.4910380881254668;
        } else if (true) {
            p = RepClassifier.N4eb6f1e53351(i);
        }
        return p;
    }
    static double N4eb6f1e53351(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -0.3279742765273312;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = -0.7801418439716312;
        } else if (true) {
            p = RepClassifier.N69dce4c13352(i);
        }
        return p;
    }
    static double N69dce4c13352(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 0.047058823529411764;
        } else if (((Double)i[9]).doubleValue() < 2.5) {
            p = 0.26153846153846155;
        } else if (true) {
            p = -0.65;
        }
        return p;
    }
    static double N31092333353(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 0.03356777493606138;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = 0.2785345232503523;
        } else if (true) {
            p = -0.09280348921734917;
        }
        return p;
    }
    static double N79143eed3354(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -0.7879746835443038;
        } else if (((Double)i[2]).doubleValue() < 2.5) {
            p = RepClassifier.N54c1f33355(i);
        } else if (true) {
            p = RepClassifier.Ne20c7d43356(i);
        }
        return p;
    }
    static double N54c1f33355(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -0.12984054669703873;
        } else if (((Double)i[12]).doubleValue() < 4.5) {
            p = -1.7681159420289856;
        } else if (true) {
            p = 0.009888751545117428;
        }
        return p;
    }
    static double Ne20c7d43356(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -1.2211394302848575;
        } else if (((Double)i[12]).doubleValue() < 3.5) {
            p = -0.5939086294416244;
        } else if (true) {
            p = -1.3298153034300793;
        }
        return p;
    }
    static double N9a64d293357(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 2.2274532047646054;
        } else if (((Double)i[2]).doubleValue() < 2.5) {
            p = 3.1178010471204187;
        } else if (true) {
            p = RepClassifier.N511df9a63358(i);
        }
        return p;
    }
    static double N511df9a63358(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 1.5465465465465464;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = RepClassifier.N7760f12f3359(i);
        } else if (true) {
            p = RepClassifier.N448243b23361(i);
        }
        return p;
    }
    static double N7760f12f3359(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 1.82421875;
        } else if (((Double)i[12]).doubleValue() < 4.5) {
            p = 2.1117021276595747;
        } else if (true) {
            p = RepClassifier.N7f7686703360(i);
        }
        return p;
    }
    static double N7f7686703360(Object []i) {
        double p = Double.NaN;
    /* IS_TRUMP_SUIT */
        if (i[6] == null) {
            p = 1.6574074074074074;
        } else if (i[6].equals("X")) {
            p = 1.5792079207920793;
        } else if (i[6].equals("N")) {
            p = 1.7767857142857142;
        } else if (i[6].equals("Y")) {
            p = 1.9;
        }
        return p;
    }
    static double N448243b23361(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 1.2546201232032854;
        } else if (((Double)i[12]).doubleValue() < 4.5) {
            p = RepClassifier.N7aec524d3362(i);
        } else if (true) {
            p = RepClassifier.Na752db63363(i);
        }
        return p;
    }
    static double N7aec524d3362(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 1.4595469255663431;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = 1.801418439716312;
        } else if (true) {
            p = 1.1726190476190477;
        }
        return p;
    }
    static double Na752db63363(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 0.898876404494382;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = 1.0869565217391304;
        } else if (true) {
            p = 0.25;
        }
        return p;
    }
    static double N41fb7f8e3364(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 3.59213958611095;
        } else if (((Double)i[2]).doubleValue() < 1.5) {
            p = RepClassifier.N17323bd03365(i);
        } else if (true) {
            p = RepClassifier.Ne340bbc3378(i);
        }
        return p;
    }
    static double N17323bd03365(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = 4.119063270336894;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = RepClassifier.Nfd47d413366(i);
        } else if (true) {
            p = RepClassifier.N50487aeb3374(i);
        }
        return p;
    }
    static double Nfd47d413366(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = 3.8494734432234434;
        } else if (((Double)i[11]).doubleValue() < 2.5) {
            p = RepClassifier.N2cefe9903367(i);
        } else if (true) {
            p = RepClassifier.N6e0d6a913372(i);
        }
        return p;
    }
    static double N2cefe9903367(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 4.041634058538112;
        } else if (((Double)i[12]).doubleValue() < 3.5) {
            p = RepClassifier.N3672f48c3368(i);
        } else if (true) {
            p = RepClassifier.N1c0af81e3370(i);
        }
        return p;
    }
    static double N3672f48c3368(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 3.4216867469879517;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = 1.155844155844156;
        } else if (true) {
            p = RepClassifier.N3018a5293369(i);
        }
        return p;
    }
    static double N3018a5293369(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 4.346765641569459;
        } else if (((Double)i[1]).doubleValue() < 6.5) {
            p = 3.3876651982378854;
        } else if (true) {
            p = 4.650837988826815;
        }
        return p;
    }
    static double N1c0af81e3370(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 4.204307449120727;
        } else if (((Double)i[1]).doubleValue() < 4.5) {
            p = 4.069748797434527;
        } else if (true) {
            p = RepClassifier.N4f7a21663371(i);
        }
        return p;
    }
    static double N4f7a21663371(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 4.586050037907506;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = 4.426470588235294;
        } else if (true) {
            p = 4.698064516129032;
        }
        return p;
    }
    static double N6e0d6a913372(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = 3.3263740945888367;
        } else if (((Double)i[11]).doubleValue() < 4.5) {
            p = RepClassifier.N1b49ab943373(i);
        } else if (true) {
            p = 0.6153846153846154;
        }
        return p;
    }
    static double N1b49ab943373(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 3.3877995642701526;
        } else if (((Double)i[1]).doubleValue() < 3.5) {
            p = 3.2213209733487833;
        } else if (true) {
            p = 3.8927943760984185;
        }
        return p;
    }
    static double N50487aeb3374(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 4.804892253931276;
        } else if (((Double)i[1]).doubleValue() < 6.5) {
            p = 4.757062146892656;
        } else if (true) {
            p = RepClassifier.N4ea710953375(i);
        }
        return p;
    }
    static double N4ea710953375(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 5.029900332225914;
        } else if (((Double)i[12]).doubleValue() < 2.5) {
            p = RepClassifier.N4b7bb2323376(i);
        } else if (true) {
            p = 4.864285714285714;
        }
        return p;
    }
    static double N4b7bb2323376(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 5.08008658008658;
        } else if (((Double)i[9]).doubleValue() < 1.5) {
            p = RepClassifier.N1db8a5c23377(i);
        } else if (true) {
            p = 5.219178082191781;
        }
        return p;
    }
    static double N1db8a5c23377(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 5.015822784810126;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = 4.674157303370786;
        } else if (true) {
            p = 5.149779735682819;
        }
        return p;
    }
    static double Ne340bbc3378(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 2.3300531391458374;
        } else if (((Double)i[2]).doubleValue() < 2.5) {
            p = RepClassifier.N78e181573379(i);
        } else if (true) {
            p = RepClassifier.N4f873a053387(i);
        }
        return p;
    }
    static double N78e181573379(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 2.924619085805934;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = RepClassifier.N6e9d465b3380(i);
        } else if (true) {
            p = RepClassifier.N6820015a3384(i);
        }
        return p;
    }
    static double N6e9d465b3380(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = 1.8110795454545454;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = RepClassifier.N365378ff3381(i);
        } else if (true) {
            p = RepClassifier.N6c8b2d0e3383(i);
        }
        return p;
    }
    static double N365378ff3381(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 1.4580419580419581;
        } else if (((Double)i[12]).doubleValue() < 3.5) {
            p = 1.0000000000000002;
        } else if (true) {
            p = RepClassifier.N1814ec623382(i);
        }
        return p;
    }
    static double N1814ec623382(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 2.8714285714285714;
        } else if (((Double)i[1]).doubleValue() < 4.5) {
            p = 2.175;
        } else if (true) {
            p = 3.15;
        }
        return p;
    }
    static double N6c8b2d0e3383(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 3.340909090909091;
        } else if (((Double)i[9]).doubleValue() < 0.5) {
            p = 2.975609756097561;
        } else if (true) {
            p = 3.5054945054945055;
        }
        return p;
    }
    static double N6820015a3384(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 3.362569832402235;
        } else if (((Double)i[1]).doubleValue() < 6.5) {
            p = RepClassifier.N459908213385(i);
        } else if (true) {
            p = RepClassifier.N7ad19b0c3386(i);
        }
        return p;
    }
    static double N459908213385(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = 3.008130081300813;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = 2.7098765432098766;
        } else if (true) {
            p = 3.5833333333333335;
        }
        return p;
    }
    static double N7ad19b0c3386(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 3.4969183359013867;
        } else if (((Double)i[12]).doubleValue() < 1.5) {
            p = 3.7318718381112985;
        } else if (true) {
            p = 3.299290780141844;
        }
        return p;
    }
    static double N4f873a053387(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 1.7568612292230383;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = RepClassifier.N2745c87e3388(i);
        } else if (true) {
            p = RepClassifier.N2a9004b73389(i);
        }
        return p;
    }
    static double N2745c87e3388(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = 0.8496732026143791;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = 0.6482939632545932;
        } else if (true) {
            p = 1.8333333333333333;
        }
        return p;
    }
    static double N2a9004b73389(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 1.9525375939849625;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = RepClassifier.N5cefe3123390(i);
        } else if (true) {
            p = RepClassifier.N12cced893399(i);
        }
        return p;
    }
    static double N5cefe3123390(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 2.141795665634675;
        } else if (((Double)i[12]).doubleValue() < 2.5) {
            p = RepClassifier.N2acebd983391(i);
        } else if (true) {
            p = RepClassifier.N5dd4353d3398(i);
        }
        return p;
    }
    static double N2acebd983391(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 2.2435508345978756;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = RepClassifier.N234196873392(i);
        } else if (true) {
            p = RepClassifier.N2751b0873397(i);
        }
        return p;
    }
    static double N234196873392(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 2.3866498740554154;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = RepClassifier.N9de9be43393(i);
        } else if (true) {
            p = RepClassifier.N7577540a3395(i);
        }
        return p;
    }
    static double N9de9be43393(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = 2.1871345029239766;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = RepClassifier.N2a8a1ebe3394(i);
        } else if (true) {
            p = 2.393617021276596;
        }
        return p;
    }
    static double N2a8a1ebe3394(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = 1.9350649350649352;
        } else if (((Double)i[0]).doubleValue() < 2.5) {
            p = 2.1452991452991452;
        } else if (true) {
            p = 1.2702702702702702;
        }
        return p;
    }
    static double N7577540a3395(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 2.5376106194690267;
        } else if (((Double)i[9]).doubleValue() < 1.5) {
            p = RepClassifier.N5aad018d3396(i);
        } else if (true) {
            p = 2.316666666666667;
        }
        return p;
    }
    static double N5aad018d3396(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = 2.6174698795180724;
        } else if (((Double)i[0]).doubleValue() < 2.5) {
            p = 2.8962264150943398;
        } else if (true) {
            p = 2.4867256637168142;
        }
        return p;
    }
    static double N2751b0873397(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = 2.0267175572519083;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = 1.8206106870229009;
        } else if (true) {
            p = 2.232824427480916;
        }
        return p;
    }
    static double N5dd4353d3398(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = 1.6902356902356903;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = 1.5984848484848484;
        } else if (true) {
            p = 2.4242424242424243;
        }
        return p;
    }
    static double N12cced893399(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 1.3567251461988303;
        } else if (((Double)i[9]).doubleValue() < 1.5) {
            p = 1.4663461538461537;
        } else if (true) {
            p = 0.8865979381443299;
        }
        return p;
    }
    static double N205f37343400(Object []i) {
        double p = Double.NaN;
    /* MOVE_SEQUENCE */
        if (i[0] == null) {
            p = 2.3714365178695593;
        } else if (((Double)i[0]).doubleValue() < 3.5) {
            p = RepClassifier.Naa07e303401(i);
        } else if (true) {
            p = RepClassifier.N54c4fed23484(i);
        }
        return p;
    }
    static double Naa07e303401(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 1.8239531405782652;
        } else if (((Double)i[2]).doubleValue() < 1.5) {
            p = RepClassifier.N7621cf843402(i);
        } else if (true) {
            p = RepClassifier.N19f4d60a3418(i);
        }
        return p;
    }
    static double N7621cf843402(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 3.941953018831295;
        } else if (((Double)i[12]).doubleValue() < 0.5) {
            p = RepClassifier.N374c46c3403(i);
        } else if (true) {
            p = RepClassifier.N5acba5a13404(i);
        }
        return p;
    }
    static double N374c46c3403(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 5.208421052631579;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = 5.504464285714286;
        } else if (true) {
            p = 5.1170798898071626;
        }
        return p;
    }
    static double N5acba5a13404(Object []i) {
        double p = Double.NaN;
    /* IS_WINNING_CARD */
        if (i[4] == null) {
            p = 3.6555582004284695;
        } else if (i[4].equals("NO")) {
            p = RepClassifier.N531311363405(i);
        } else if (i[4].equals("YES")) {
            p = RepClassifier.Ne445f913407(i);
        }
        return p;
    }
    static double N531311363405(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 2.2042186001917545;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = RepClassifier.N2b36a93f3406(i);
        } else if (true) {
            p = 0.4557823129251701;
        }
        return p;
    }
    static double N2b36a93f3406(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 2.4910714285714284;
        } else if (((Double)i[12]).doubleValue() < 1.5) {
            p = 3.6096385542168674;
        } else if (true) {
            p = 1.525987525987526;
        }
        return p;
    }
    static double Ne445f913407(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 4.134895503483217;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = RepClassifier.N92515553408(i);
        } else if (true) {
            p = RepClassifier.N16f191673416(i);
        }
        return p;
    }
    static double N92515553408(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 3.8652291105121295;
        } else if (((Double)i[12]).doubleValue() < 2.5) {
            p = 1.1142857142857143;
        } else if (true) {
            p = RepClassifier.N42743fe63409(i);
        }
        return p;
    }
    static double N42743fe63409(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = 3.9545454545454546;
        } else if (((Double)i[11]).doubleValue() < 3.5) {
            p = RepClassifier.N5c9519c63410(i);
        } else if (true) {
            p = 2.2627737226277373;
        }
        return p;
    }
    static double N5c9519c63410(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = 4.069341258048539;
        } else if (((Double)i[11]).doubleValue() < 1.5) {
            p = 4.393772893772894;
        } else if (true) {
            p = RepClassifier.N70016d123411(i);
        }
        return p;
    }
    static double N70016d123411(Object []i) {
        double p = Double.NaN;
    /* IS_TRUMP_SUIT */
        if (i[6] == null) {
            p = 3.94908350305499;
        } else if (i[6].equals("X")) {
            p = RepClassifier.N512f41fa3412(i);
        } else if (i[6].equals("N")) {
            p = 3.8869395711500974;
        } else if (i[6].equals("Y")) {
            p = 5.057142857142857;
        }
        return p;
    }
    static double N512f41fa3412(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 3.9416216216216218;
        } else if (((Double)i[1]).doubleValue() < 1.5) {
            p = RepClassifier.N3247cf363413(i);
        } else if (true) {
            p = RepClassifier.N4668ab913414(i);
        }
        return p;
    }
    static double N3247cf363413(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = 3.70746887966805;
        } else if (((Double)i[11]).doubleValue() < 2.5) {
            p = 3.9768976897689767;
        } else if (true) {
            p = 3.2513966480446927;
        }
        return p;
    }
    static double N4668ab913414(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = 4.196388261851016;
        } else if (((Double)i[11]).doubleValue() < 2.5) {
            p = RepClassifier.N3dfa27b33415(i);
        } else if (true) {
            p = 3.848314606741573;
        }
        return p;
    }
    static double N3dfa27b33415(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 4.430188679245283;
        } else if (((Double)i[1]).doubleValue() < 3.5) {
            p = 4.411255411255412;
        } else if (true) {
            p = 4.5588235294117645;
        }
        return p;
    }
    static double N16f191673416(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 4.778969957081545;
        } else if (((Double)i[1]).doubleValue() < 6.5) {
            p = 4.565934065934066;
        } else if (true) {
            p = RepClassifier.N1a43d2f03417(i);
        }
        return p;
    }
    static double N1a43d2f03417(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 4.915492957746479;
        } else if (((Double)i[12]).doubleValue() < 3.5) {
            p = 4.962655601659751;
        } else if (true) {
            p = 4.651162790697675;
        }
        return p;
    }
    static double N19f4d60a3418(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 1.5119677428579599;
        } else if (((Double)i[12]).doubleValue() < 0.5) {
            p = RepClassifier.N75dfad383419(i);
        } else if (true) {
            p = RepClassifier.N33455bdf3430(i);
        }
        return p;
    }
    static double N75dfad383419(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 2.9337148307105387;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = RepClassifier.N6f3f604d3420(i);
        } else if (true) {
            p = RepClassifier.N5c2ae52e3423(i);
        }
        return p;
    }
    static double N6f3f604d3420(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 3.6145948945615984;
        } else if (((Double)i[2]).doubleValue() < 2.5) {
            p = RepClassifier.N6b6feb083421(i);
        } else if (true) {
            p = RepClassifier.N549434e93422(i);
        }
        return p;
    }
    static double N6b6feb083421(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 4.212046204620462;
        } else if (((Double)i[1]).doubleValue() < 6.5) {
            p = 4.401727861771058;
        } else if (true) {
            p = 4.09479305740988;
        }
        return p;
    }
    static double N549434e93422(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 3.3118729096989967;
        } else if (((Double)i[9]).doubleValue() < 1.5) {
            p = 3.0910569105691055;
        } else if (true) {
            p = 3.3882948790095666;
        }
        return p;
    }
    static double N5c2ae52e3423(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 2.420777591973244;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = RepClassifier.N4883dbee3424(i);
        } else if (true) {
            p = 2.3519099947671376;
        }
        return p;
    }
    static double N4883dbee3424(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 2.6943866943866945;
        } else if (((Double)i[9]).doubleValue() < 5.5) {
            p = 2.8312020460358056;
        } else if (true) {
            p = RepClassifier.N5c205e5d3425(i);
        }
        return p;
    }
    static double N5c205e5d3425(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 2.6007005253940454;
        } else if (((Double)i[1]).doubleValue() < 4.5) {
            p = RepClassifier.N29e61a4c3426(i);
        } else if (true) {
            p = RepClassifier.N22ee99cb3427(i);
        }
        return p;
    }
    static double N29e61a4c3426(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 2.6379928315412187;
        } else if (((Double)i[2]).doubleValue() < 7.5) {
            p = 2.5323383084577116;
        } else if (true) {
            p = 2.91025641025641;
        }
        return p;
    }
    static double N22ee99cb3427(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 2.565068493150685;
        } else if (((Double)i[9]).doubleValue() < 6.5) {
            p = RepClassifier.N74647ad33428(i);
        } else if (true) {
            p = RepClassifier.N2ae810b43429(i);
        }
        return p;
    }
    static double N74647ad33428(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 2.6942148760330578;
        } else if (((Double)i[2]).doubleValue() < 7.5) {
            p = 2.855421686746988;
        } else if (true) {
            p = 2.3421052631578947;
        }
        return p;
    }
    static double N2ae810b43429(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 2.473684210526316;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = 2.610526315789474;
        } else if (true) {
            p = 2.3026315789473686;
        }
        return p;
    }
    static double N33455bdf3430(Object []i) {
        double p = Double.NaN;
    /* IS_BIGGEST_SUIT_REMAINING */
        if (i[5] == null) {
            p = 1.0633159023362553;
        } else if (i[5].equals("N")) {
            p = RepClassifier.N65b3acbd3431(i);
        } else if (i[5].equals("Y")) {
            p = RepClassifier.N7d00a1883468(i);
        }
        return p;
    }
    static double N65b3acbd3431(Object []i) {
        double p = Double.NaN;
    /* IS_WINNING_CARD */
        if (i[4] == null) {
            p = 0.7034089881544443;
        } else if (i[4].equals("NO")) {
            p = RepClassifier.N3256f03a3432(i);
        } else if (i[4].equals("YES")) {
            p = RepClassifier.N1aea8c213455(i);
        }
        return p;
    }
    static double N3256f03a3432(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 0.9769214369470206;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = RepClassifier.N58512b743433(i);
        } else if (true) {
            p = RepClassifier.N56c3d3893445(i);
        }
        return p;
    }
    static double N58512b743433(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 1.4067590987868284;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = RepClassifier.N415318023434(i);
        } else if (true) {
            p = 0.3312202852614897;
        }
        return p;
    }
    static double N415318023434(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 1.5388207822533566;
        } else if (((Double)i[12]).doubleValue() < 1.5) {
            p = RepClassifier.N397d92d13435(i);
        } else if (true) {
            p = RepClassifier.N6df4f49e3437(i);
        }
        return p;
    }
    static double N397d92d13435(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 2.331958762886598;
        } else if (((Double)i[2]).doubleValue() < 2.5) {
            p = 2.761904761904762;
        } else if (true) {
            p = RepClassifier.N3c2f62e43436(i);
        }
        return p;
    }
    static double N3c2f62e43436(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 2.1041009463722395;
        } else if (((Double)i[9]).doubleValue() < 1.5) {
            p = 3.1025641025641026;
        } else if (true) {
            p = 2.06140350877193;
        }
        return p;
    }
    static double N6df4f49e3437(Object []i) {
        double p = Double.NaN;
    /* IS_ROUND_SUIT */
        if (i[7] == null) {
            p = 1.22557003257329;
        } else if (i[7].equals("Y")) {
            p = 1.6924342105263157;
        } else if (i[7].equals("N")) {
            p = RepClassifier.N343e622a3438(i);
        }
        return p;
    }
    static double N343e622a3438(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 0.7677419354838709;
        } else if (((Double)i[12]).doubleValue() < 2.5) {
            p = RepClassifier.N610095663439(i);
        } else if (true) {
            p = 0.5905325443786982;
        }
        return p;
    }
    static double N610095663439(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 0.9152709359605912;
        } else if (((Double)i[9]).doubleValue() < 4.5) {
            p = 0.5650623885918004;
        } else if (true) {
            p = RepClassifier.N26fff3e03440(i);
        }
        return p;
    }
    static double N26fff3e03440(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 1.3480176211453745;
        } else if (((Double)i[2]).doubleValue() < 2.5) {
            p = RepClassifier.N6c65a3a53441(i);
        } else if (true) {
            p = RepClassifier.N2b8da3313442(i);
        }
        return p;
    }
    static double N6c65a3a53441(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 0.8366013071895425;
        } else if (((Double)i[9]).doubleValue() < 7.5) {
            p = 1.320754716981132;
        } else if (true) {
            p = -0.2553191489361702;
        }
        return p;
    }
    static double N2b8da3313442(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 1.6079734219269104;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = RepClassifier.N4ec3a8833443(i);
        } else if (true) {
            p = 2.066225165562914;
        }
        return p;
    }
    static double N4ec3a8833443(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 1.1466666666666667;
        } else if (((Double)i[9]).doubleValue() < 7.5) {
            p = RepClassifier.N177a22483444(i);
        } else if (true) {
            p = 2.0232558139534884;
        }
        return p;
    }
    static double N177a22483444(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 0.794392523364486;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = 0.37662337662337664;
        } else if (true) {
            p = 1.8666666666666667;
        }
        return p;
    }
    static double N56c3d3893445(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 0.7860221674876847;
        } else if (((Double)i[9]).doubleValue() < 1.5) {
            p = RepClassifier.N1011764b3446(i);
        } else if (true) {
            p = RepClassifier.N3f8ffd1a3454(i);
        }
        return p;
    }
    static double N1011764b3446(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 0.4463369108726085;
        } else if (((Double)i[12]).doubleValue() < 5.5) {
            p = RepClassifier.N4345537a3447(i);
        } else if (true) {
            p = 0.5828473413379074;
        }
        return p;
    }
    static double N4345537a3447(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 0.1560904449307075;
        } else if (((Double)i[1]).doubleValue() < 4.5) {
            p = RepClassifier.N5eb51383448(i);
        } else if (true) {
            p = RepClassifier.N56c4015d3450(i);
        }
        return p;
    }
    static double N5eb51383448(Object []i) {
        double p = Double.NaN;
    /* IS_TRUMP_SUIT */
        if (i[6] == null) {
            p = -0.46096654275092935;
        } else if (i[6].equals("X")) {
            p = RepClassifier.N4d7c85973449(i);
        } else if (i[6].equals("N")) {
            p = -0.7058823529411765;
        } else if (i[6].equals("Y")) {
            p = 2.2;
        }
        return p;
    }
    static double N4d7c85973449(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -0.5739644970414202;
        } else if (((Double)i[11]).doubleValue() < 1.5) {
            p = -0.3142857142857143;
        } else if (true) {
            p = -1.8275862068965518;
        }
        return p;
    }
    static double N56c4015d3450(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 0.30671506352087113;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = RepClassifier.N3f73567c3451(i);
        } else if (true) {
            p = RepClassifier.N60cea23b3452(i);
        }
        return p;
    }
    static double N3f73567c3451(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 0.7066666666666667;
        } else if (((Double)i[12]).doubleValue() < 1.5) {
            p = 1.9473684210526316;
        } else if (true) {
            p = 0.2857142857142857;
        }
        return p;
    }
    static double N60cea23b3452(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 0.15710723192019949;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = RepClassifier.N4937d3883453(i);
        } else if (true) {
            p = -0.04578313253012048;
        }
        return p;
    }
    static double N4937d3883453(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 0.37467700258397935;
        } else if (((Double)i[2]).doubleValue() < 5.5) {
            p = 0.17142857142857143;
        } else if (true) {
            p = 0.615819209039548;
        }
        return p;
    }
    static double N3f8ffd1a3454(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 0.9532506317482197;
        } else if (((Double)i[12]).doubleValue() < 1.5) {
            p = 1.5386875612144957;
        } else if (true) {
            p = 0.773859543817527;
        }
        return p;
    }
    static double N1aea8c213455(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -0.8256853396901073;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = RepClassifier.Nfa03a3d3456(i);
        } else if (true) {
            p = -3.307142857142857;
        }
        return p;
    }
    static double Nfa03a3d3456(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -0.7176616915422885;
        } else if (((Double)i[2]).doubleValue() < 2.5) {
            p = RepClassifier.N78fc03d23457(i);
        } else if (true) {
            p = RepClassifier.N38db56fa3458(i);
        }
        return p;
    }
    static double N78fc03d23457(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -0.15979899497487438;
        } else if (((Double)i[12]).doubleValue() < 3.5) {
            p = -1.4675324675324675;
        } else if (true) {
            p = -0.05010893246187364;
        }
        return p;
    }
    static double N38db56fa3458(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = -0.9675821701936065;
        } else if (((Double)i[12]).doubleValue() < 4.5) {
            p = RepClassifier.N769e4e443459(i);
        } else if (true) {
            p = RepClassifier.N71f030a63464(i);
        }
        return p;
    }
    static double N769e4e443459(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -0.43777292576419213;
        } else if (((Double)i[11]).doubleValue() < 1.5) {
            p = RepClassifier.N78e1e3783460(i);
        } else if (true) {
            p = RepClassifier.N601b9d253461(i);
        }
        return p;
    }
    static double N78e1e3783460(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -0.7487520798668885;
        } else if (((Double)i[9]).doubleValue() < 3.5) {
            p = -0.5587628865979382;
        } else if (true) {
            p = -1.543103448275862;
        }
        return p;
    }
    static double N601b9d253461(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 0.15555555555555556;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = RepClassifier.N2157b5a3462(i);
        } else if (true) {
            p = -0.174496644295302;
        }
        return p;
    }
    static double N2157b5a3462(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 0.45180722891566266;
        } else if (((Double)i[12]).doubleValue() < 3.5) {
            p = 0.9139784946236559;
        } else if (true) {
            p = RepClassifier.N67df9323463(i);
        }
        return p;
    }
    static double N67df9323463(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -0.136986301369863;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = 0.5142857142857142;
        } else if (true) {
            p = -0.7368421052631579;
        }
        return p;
    }
    static double N71f030a63464(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.3394636015325672;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = RepClassifier.N4dbe69083465(i);
        } else if (true) {
            p = -1.6172661870503597;
        }
        return p;
    }
    static double N4dbe69083465(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -1.022950819672131;
        } else if (((Double)i[11]).doubleValue() < 1.5) {
            p = -0.7522522522522522;
        } else if (true) {
            p = RepClassifier.N64d8044e3466(i);
        }
        return p;
    }
    static double N64d8044e3466(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -1.1778350515463918;
        } else if (((Double)i[1]).doubleValue() < 1.5) {
            p = -1.5629629629629629;
        } else if (true) {
            p = RepClassifier.Nd05c58e3467(i);
        }
        return p;
    }
    static double Nd05c58e3467(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_ME */
        if (i[11] == null) {
            p = -0.9723320158102767;
        } else if (((Double)i[11]).doubleValue() < 2.5) {
            p = -1.344632768361582;
        } else if (true) {
            p = -0.10526315789473684;
        }
        return p;
    }
    static double N7d00a1883468(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 2.846963925610576;
        } else if (((Double)i[12]).doubleValue() < 4.5) {
            p = RepClassifier.N434861093469(i);
        } else if (true) {
            p = 4.8;
        }
        return p;
    }
    static double N434861093469(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 2.5865921787709496;
        } else if (((Double)i[1]).doubleValue() < 4.5) {
            p = RepClassifier.N6796e75a3470(i);
        } else if (true) {
            p = RepClassifier.N441c77933471(i);
        }
        return p;
    }
    static double N6796e75a3470(Object []i) {
        double p = Double.NaN;
    /* IS_TRUMP_SUIT */
        if (i[6] == null) {
            p = 0.2332155477031802;
        } else if (i[6].equals("X")) {
            p = 0.0851063829787234;
        } else if (i[6].equals("N")) {
            p = -0.064;
        } else if (i[6].equals("Y")) {
            p = 3.6470588235294117;
        }
        return p;
    }
    static double N441c77933471(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 2.7688098495212037;
        } else if (((Double)i[2]).doubleValue() < 2.5) {
            p = RepClassifier.N3ce882793472(i);
        } else if (true) {
            p = RepClassifier.N4b5322da3475(i);
        }
        return p;
    }
    static double N3ce882793472(Object []i) {
        double p = Double.NaN;
    /* IS_WINNING_CARD */
        if (i[4] == null) {
            p = 3.63718820861678;
        } else if (i[4].equals("NO")) {
            p = 5.304878048780488;
        } else if (i[4].equals("YES")) {
            p = RepClassifier.N3ca8ecc43473(i);
        }
        return p;
    }
    static double N3ca8ecc43473(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 3.256267409470752;
        } else if (((Double)i[12]).doubleValue() < 1.5) {
            p = 3.623015873015873;
        } else if (true) {
            p = RepClassifier.N6cd4703c3474(i);
        }
        return p;
    }
    static double N6cd4703c3474(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 3.0579399141630903;
        } else if (((Double)i[9]).doubleValue() < 1.5) {
            p = 2.1315789473684212;
        } else if (true) {
            p = 3.1401869158878504;
        }
        return p;
    }
    static double N4b5322da3475(Object []i) {
        double p = Double.NaN;
    /* IS_WINNING_CARD */
        if (i[4] == null) {
            p = 2.4926072845293907;
        } else if (i[4].equals("NO")) {
            p = RepClassifier.N33d08a833476(i);
        } else if (i[4].equals("YES")) {
            p = RepClassifier.N696bc86c3483(i);
        }
        return p;
    }
    static double N33d08a833476(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 2.758217270194986;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = 3.687062937062937;
        } else if (true) {
            p = RepClassifier.N48659ef13477(i);
        }
        return p;
    }
    static double N48659ef13477(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 2.3237939493049877;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = 0.9824561403508771;
        } else if (true) {
            p = RepClassifier.N77f42513478(i);
        }
        return p;
    }
    static double N77f42513478(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 2.3893653516295026;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = 2.1002331002331003;
        } else if (true) {
            p = RepClassifier.N5568e5963479(i);
        }
        return p;
    }
    static double N5568e5963479(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 2.5576662143826323;
        } else if (((Double)i[2]).doubleValue() < 5.5) {
            p = RepClassifier.N62dbe92a3480(i);
        } else if (true) {
            p = RepClassifier.N6ad71963481(i);
        }
        return p;
    }
    static double N62dbe92a3480(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 2.930817610062893;
        } else if (((Double)i[9]).doubleValue() < 1.5) {
            p = 3.1260504201680672;
        } else if (true) {
            p = 2.35;
        }
        return p;
    }
    static double N6ad71963481(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 2.4550173010380623;
        } else if (((Double)i[2]).doubleValue() < 7.5) {
            p = RepClassifier.N7bbdd6d83482(i);
        } else if (true) {
            p = 2.233502538071066;
        }
        return p;
    }
    static double N7bbdd6d83482(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 2.5695538057742784;
        } else if (((Double)i[9]).doubleValue() < 1.5) {
            p = 2.6666666666666665;
        } else if (true) {
            p = 1.9411764705882353;
        }
        return p;
    }
    static double N696bc86c3483(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 2.005112474437628;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = 2.2214673913043477;
        } else if (true) {
            p = 1.3471074380165289;
        }
        return p;
    }
    static double N54c4fed23484(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 3.6332146139705883;
        } else if (((Double)i[2]).doubleValue() < 2.5) {
            p = RepClassifier.N3988041d3485(i);
        } else if (true) {
            p = RepClassifier.N7bf633cc3497(i);
        }
        return p;
    }
    static double N3988041d3485(Object []i) {
        double p = Double.NaN;
    /* IS_WINNING_CARD */
        if (i[4] == null) {
            p = 4.754476806903991;
        } else if (i[4].equals("NO")) {
            p = RepClassifier.N2c160ee23486(i);
        } else if (i[4].equals("YES")) {
            p = RepClassifier.N65b019483495(i);
        }
        return p;
    }
    static double N2c160ee23486(Object []i) {
        double p = Double.NaN;
    /* IS_BIGGEST_SUIT_REMAINING */
        if (i[5] == null) {
            p = 5.06633048875097;
        } else if (i[5].equals("N")) {
            p = RepClassifier.N1b898ba43487(i);
        } else if (i[5].equals("Y")) {
            p = RepClassifier.N11198d913489(i);
        }
        return p;
    }
    static double N1b898ba43487(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 4.807370184254606;
        } else if (((Double)i[2]).doubleValue() < 1.5) {
            p = 5.509316770186335;
        } else if (true) {
            p = RepClassifier.N6848c4693488(i);
        }
        return p;
    }
    static double N6848c4693488(Object []i) {
        double p = Double.NaN;
    /* IS_ROUND_SUIT */
        if (i[7] == null) {
            p = 4.330520393811533;
        } else if (i[7].equals("Y")) {
            p = 3.5182481751824817;
        } else if (i[7].equals("N")) {
            p = 4.524390243902439;
        }
        return p;
    }
    static double N11198d913489(Object []i) {
        double p = Double.NaN;
    /* IS_TRUMP_SUIT */
        if (i[6] == null) {
            p = 5.289739884393064;
        } else if (i[6].equals("X")) {
            p = 5.675438596491228;
        } else if (i[6].equals("N")) {
            p = RepClassifier.Nde4e04e3490(i);
        } else if (i[6].equals("Y")) {
            p = 6.25;
        }
        return p;
    }
    static double Nde4e04e3490(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 5.158959537572255;
        } else if (((Double)i[9]).doubleValue() < 2.5) {
            p = RepClassifier.N5ae79efd3491(i);
        } else if (true) {
            p = RepClassifier.N74a262443492(i);
        }
        return p;
    }
    static double N5ae79efd3491(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 4.8541114058355435;
        } else if (((Double)i[2]).doubleValue() < 1.5) {
            p = 5.305555555555555;
        } else if (true) {
            p = 4.575107296137339;
        }
        return p;
    }
    static double N74a262443492(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 5.332829046898638;
        } else if (((Double)i[2]).doubleValue() < 1.5) {
            p = 4.989218328840971;
        } else if (true) {
            p = RepClassifier.N298a0c443493(i);
        }
        return p;
    }
    static double N298a0c443493(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 5.772413793103448;
        } else if (((Double)i[12]).doubleValue() < 4.5) {
            p = 5.452991452991453;
        } else if (true) {
            p = RepClassifier.N3466fab3494(i);
        }
        return p;
    }
    static double N3466fab3494(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 5.988439306358382;
        } else if (((Double)i[1]).doubleValue() < 1.5) {
            p = 6.393939393939394;
        } else if (true) {
            p = 5.892857142857143;
        }
        return p;
    }
    static double N65b019483495(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 4.363636363636363;
        } else if (((Double)i[2]).doubleValue() < 1.5) {
            p = 4.814060446780552;
        } else if (true) {
            p = RepClassifier.N2e7e7f83496(i);
        }
        return p;
    }
    static double N2e7e7f83496(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 3.0822429906542057;
        } else if (((Double)i[12]).doubleValue() < 2.5) {
            p = 3.310810810810811;
        } else if (true) {
            p = 2.994832041343669;
        }
        return p;
    }
    static double N7bf633cc3497(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 3.2263368041963516;
        } else if (((Double)i[12]).doubleValue() < 3.5) {
            p = RepClassifier.N4b7d302e3498(i);
        } else if (true) {
            p = RepClassifier.N686ed5e33517(i);
        }
        return p;
    }
    static double N4b7d302e3498(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 2.8612924281984333;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = RepClassifier.N2ee20a503499(i);
        } else if (true) {
            p = RepClassifier.N590de6283508(i);
        }
        return p;
    }
    static double N2ee20a503499(Object []i) {
        double p = Double.NaN;
    /* IS_WINNING_CARD */
        if (i[4] == null) {
            p = 3.4431984397854705;
        } else if (i[4].equals("NO")) {
            p = RepClassifier.N1387f0533500(i);
        } else if (i[4].equals("YES")) {
            p = 1.984924623115578;
        }
        return p;
    }
    static double N1387f0533500(Object []i) {
        double p = Double.NaN;
    /* IS_BIGGEST_SUIT_REMAINING */
        if (i[5] == null) {
            p = 3.599892008639309;
        } else if (i[5].equals("N")) {
            p = RepClassifier.N5925d9bc3501(i);
        } else if (i[5].equals("Y")) {
            p = RepClassifier.N512fd8c53507(i);
        }
        return p;
    }
    static double N5925d9bc3501(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 3.449960598896769;
        } else if (((Double)i[12]).doubleValue() < 2.5) {
            p = RepClassifier.N7bfb6ef63502(i);
        } else if (true) {
            p = 3.5863636363636364;
        }
        return p;
    }
    static double N7bfb6ef63502(Object []i) {
        double p = Double.NaN;
    /* IS_ROUND_SUIT */
        if (i[7] == null) {
            p = 3.421353670162059;
        } else if (i[7].equals("Y")) {
            p = RepClassifier.N45755b533503(i);
        } else if (i[7].equals("N")) {
            p = RepClassifier.N69dc3ec63504(i);
        }
        return p;
    }
    static double N45755b533503(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 3.185840707964602;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = 2.945945945945946;
        } else if (true) {
            p = 3.641025641025641;
        }
        return p;
    }
    static double N69dc3ec63504(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 3.449786324786325;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = RepClassifier.N1e43f2783505(i);
        } else if (true) {
            p = 3.3950617283950617;
        }
        return p;
    }
    static double N1e43f2783505(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 3.468975468975469;
        } else if (((Double)i[12]).doubleValue() < 0.5) {
            p = RepClassifier.N3e6fb3983506(i);
        } else if (true) {
            p = 3.422360248447205;
        }
        return p;
    }
    static double N3e6fb3983506(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 3.5761904761904764;
        } else if (((Double)i[9]).doubleValue() < 7.5) {
            p = 3.395209580838323;
        } else if (true) {
            p = 4.27906976744186;
        }
        return p;
    }
    static double N512fd8c53507(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 3.926243567753002;
        } else if (((Double)i[9]).doubleValue() < 2.5) {
            p = 3.8152610441767068;
        } else if (true) {
            p = 4.576470588235294;
        }
        return p;
    }
    static double N590de6283508(Object []i) {
        double p = Double.NaN;
    /* IS_WINNING_CARD */
        if (i[4] == null) {
            p = 2.5685553102771648;
        } else if (i[4].equals("NO")) {
            p = RepClassifier.N585c1f433509(i);
        } else if (i[4].equals("YES")) {
            p = 0.5526315789473685;
        }
        return p;
    }
    static double N585c1f433509(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 2.587521663778163;
        } else if (((Double)i[12]).doubleValue() < 1.5) {
            p = 2.4921439432336543;
        } else if (true) {
            p = RepClassifier.N1bec94a33510(i);
        }
        return p;
    }
    static double N1bec94a33510(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 2.6786060019361084;
        } else if (((Double)i[1]).doubleValue() < 6.5) {
            p = RepClassifier.N34aa8eeb3511(i);
        } else if (true) {
            p = RepClassifier.N253562043515(i);
        }
        return p;
    }
    static double N34aa8eeb3511(Object []i) {
        double p = Double.NaN;
    /* IS_BIGGEST_SUIT_REMAINING */
        if (i[5] == null) {
            p = 2.5810473815461346;
        } else if (i[5].equals("N")) {
            p = RepClassifier.N22002f03512(i);
        } else if (i[5].equals("Y")) {
            p = RepClassifier.N450871983514(i);
        }
        return p;
    }
    static double N22002f03512(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 2.5278164116828927;
        } else if (((Double)i[2]).doubleValue() < 7.5) {
            p = 2.4723809523809526;
        } else if (true) {
            p = RepClassifier.N3a3ea3f03513(i);
        }
        return p;
    }
    static double N3a3ea3f03513(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 2.6778350515463916;
        } else if (((Double)i[1]).doubleValue() < 3.5) {
            p = 2.2134831460674156;
        } else if (true) {
            p = 2.8160535117056855;
        }
        return p;
    }
    static double N450871983514(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 3.0421686746987953;
        } else if (((Double)i[2]).doubleValue() < 5.5) {
            p = 3.3209876543209877;
        } else if (true) {
            p = 2.776470588235294;
        }
        return p;
    }
    static double N253562043515(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 3.017316017316017;
        } else if (((Double)i[12]).doubleValue() < 2.5) {
            p = RepClassifier.N2700d3d03516(i);
        } else if (true) {
            p = 3.1824817518248176;
        }
        return p;
    }
    static double N2700d3d03516(Object []i) {
        double p = Double.NaN;
    /* IS_ROUND_SUIT */
        if (i[7] == null) {
            p = 2.9476923076923076;
        } else if (i[7].equals("Y")) {
            p = 3.0798319327731094;
        } else if (i[7].equals("N")) {
            p = 2.586206896551724;
        }
        return p;
    }
    static double N686ed5e33517(Object []i) {
        double p = Double.NaN;
    /* IS_BIGGEST_SUIT_REMAINING */
        if (i[5] == null) {
            p = 3.562979683972912;
        } else if (i[5].equals("N")) {
            p = RepClassifier.N6e6cedc73518(i);
        } else if (i[5].equals("Y")) {
            p = RepClassifier.N6c14fd2a3525(i);
        }
        return p;
    }
    static double N6e6cedc73518(Object []i) {
        double p = Double.NaN;
    /* IS_WINNING_CARD */
        if (i[4] == null) {
            p = 3.4637386683338542;
        } else if (i[4].equals("NO")) {
            p = RepClassifier.N60c7974c3519(i);
        } else if (i[4].equals("YES")) {
            p = RepClassifier.N9402f363524(i);
        }
        return p;
    }
    static double N60c7974c3519(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 3.5640983606557377;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = 4.098649442160893;
        } else if (true) {
            p = RepClassifier.N417856d73520(i);
        }
        return p;
    }
    static double N417856d73520(Object []i) {
        double p = Double.NaN;
    /* IS_ROUND_SUIT */
        if (i[7] == null) {
            p = 3.3570616329315444;
        } else if (i[7].equals("Y")) {
            p = RepClassifier.N5fa752d63521(i);
        } else if (i[7].equals("N")) {
            p = RepClassifier.N562c8e303522(i);
        }
        return p;
    }
    static double N5fa752d63521(Object []i) {
        double p = Double.NaN;
    /* IS_TRUMP_SUIT */
        if (i[6] == null) {
            p = 3.379809976247031;
        } else if (i[6].equals("X")) {
            p = 3.4537213740458017;
        } else if (i[6].equals("N")) {
            p = 3.2982800982800984;
        } else if (i[6].equals("Y")) {
            p = 3.518987341772152;
        }
        return p;
    }
    static double N562c8e303522(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 2.8449197860962565;
        } else if (((Double)i[2]).doubleValue() < 7.5) {
            p = RepClassifier.Na0d1e4e3523(i);
        } else if (true) {
            p = 2.688888888888889;
        }
        return p;
    }
    static double Na0d1e4e3523(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 2.8943661971830985;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = 2.628205128205128;
        } else if (true) {
            p = 3.21875;
        }
        return p;
    }
    static double N9402f363524(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 1.4093959731543624;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = 1.6785714285714286;
        } else if (true) {
            p = 0.8921568627450981;
        }
        return p;
    }
    static double N6c14fd2a3525(Object []i) {
        double p = Double.NaN;
    /* ROUND_SUIT_REMAINING_CARDS */
        if (i[12] == null) {
            p = 6.133603238866397;
        } else if (((Double)i[12]).doubleValue() < 4.5) {
            p = 5.02;
        } else if (true) {
            p = RepClassifier.N5efba3963526(i);
        }
        return p;
    }
    static double N5efba3963526(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 6.416243654822335;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = 6.2926829268292686;
        } else if (true) {
            p = 7.03030303030303;
        }
        return p;
    }
    static double N3ce629693527(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 0.10790775681341719;
        } else if (((Double)i[2]).doubleValue() < 1.5) {
            p = RepClassifier.N34d7885c3528(i);
        } else if (true) {
            p = RepClassifier.N5b7219273548(i);
        }
        return p;
    }
    static double N34d7885c3528(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 3.4585997442455243;
        } else if (((Double)i[1]).doubleValue() < 6.5) {
            p = RepClassifier.N7fe1de413529(i);
        } else if (true) {
            p = RepClassifier.N1fad39953543(i);
        }
        return p;
    }
    static double N7fe1de413529(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 3.1022099447513813;
        } else if (((Double)i[9]).doubleValue() < 4.5) {
            p = RepClassifier.N7c0535383530(i);
        } else if (true) {
            p = RepClassifier.N5d2387d63534(i);
        }
        return p;
    }
    static double N7c0535383530(Object []i) {
        double p = Double.NaN;
    /* IS_TRUMP_SUIT */
        if (i[6] == null) {
            p = 2.6153846153846154;
        } else if (i[6].equals("X")) {
            p = 2.8793103448275863;
        } else if (i[6].equals("N")) {
            p = RepClassifier.N71a5e6b03531(i);
        } else if (i[6].equals("Y")) {
            p = 3.6470588235294117;
        }
        return p;
    }
    static double N71a5e6b03531(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 2.024024024024024;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = RepClassifier.N79b805b03532(i);
        } else if (true) {
            p = 2.9022082018927446;
        }
        return p;
    }
    static double N79b805b03532(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 1.2263610315186246;
        } else if (((Double)i[1]).doubleValue() < 1.5) {
            p = 4.218181818181818;
        } else if (true) {
            p = RepClassifier.N85acf103533(i);
        }
        return p;
    }
    static double N85acf103533(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 0.6666666666666666;
        } else if (((Double)i[1]).doubleValue() < 4.5) {
            p = -0.7006802721088435;
        } else if (true) {
            p = 2.0340136054421767;
        }
        return p;
    }
    static double N5d2387d63534(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 3.435062611806798;
        } else if (((Double)i[1]).doubleValue() < 4.5) {
            p = RepClassifier.N36d7aa43535(i);
        } else if (true) {
            p = RepClassifier.N70a0282e3541(i);
        }
        return p;
    }
    static double N36d7aa43535(Object []i) {
        double p = Double.NaN;
    /* IS_TRUMP_SUIT */
        if (i[6] == null) {
            p = 3.1552763819095477;
        } else if (i[6].equals("X")) {
            p = 3.1552763819095477;
        } else if (i[6].equals("N")) {
            p = RepClassifier.N3a417afc3536(i);
        } else if (i[6].equals("Y")) {
            p = RepClassifier.N7c96c51f3540(i);
        }
        return p;
    }
    static double N3a417afc3536(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 2.9790544584081387;
        } else if (((Double)i[1]).doubleValue() < 2.5) {
            p = RepClassifier.N643d10eb3537(i);
        } else if (true) {
            p = 3.3312788906009243;
        }
        return p;
    }
    static double N643d10eb3537(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 2.755381604696673;
        } else if (((Double)i[9]).doubleValue() < 6.5) {
            p = RepClassifier.N2561368d3538(i);
        } else if (true) {
            p = 2.3958333333333335;
        }
        return p;
    }
    static double N2561368d3538(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 3.07380073800738;
        } else if (((Double)i[1]).doubleValue() < 1.5) {
            p = RepClassifier.N4d31d0df3539(i);
        } else if (true) {
            p = 2.2291666666666665;
        }
        return p;
    }
    static double N4d31d0df3539(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 3.1558704453441297;
        } else if (((Double)i[9]).doubleValue() < 5.5) {
            p = 3.6774193548387095;
        } else if (true) {
            p = 2.9174041297935105;
        }
        return p;
    }
    static double N7c96c51f3540(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 4.078369905956113;
        } else if (((Double)i[9]).doubleValue() < 5.5) {
            p = 3.5284552845528454;
        } else if (true) {
            p = 4.423469387755102;
        }
        return p;
    }
    static double N70a0282e3541(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 4.126708074534162;
        } else if (((Double)i[1]).doubleValue() < 5.5) {
            p = RepClassifier.N5c59ade93542(i);
        } else if (true) {
            p = 4.37434554973822;
        }
        return p;
    }
    static double N5c59ade93542(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 3.9030732860520096;
        } else if (((Double)i[9]).doubleValue() < 5.5) {
            p = 3.1866666666666665;
        } else if (true) {
            p = 4.057471264367816;
        }
        return p;
    }
    static double N1fad39953543(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 4.540645161290323;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = RepClassifier.N5559b9423544(i);
        } else if (true) {
            p = 4.870493991989319;
        }
        return p;
    }
    static double N5559b9423544(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 4.2322097378277155;
        } else if (((Double)i[9]).doubleValue() < 4.5) {
            p = RepClassifier.N24c90a9f3545(i);
        } else if (true) {
            p = 4.6521739130434785;
        }
        return p;
    }
    static double N24c90a9f3545(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 4.063047285464098;
        } else if (((Double)i[9]).doubleValue() < 1.5) {
            p = 3.74;
        } else if (true) {
            p = RepClassifier.N356edd0a3546(i);
        }
        return p;
    }
    static double N356edd0a3546(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 4.09404990403071;
        } else if (((Double)i[9]).doubleValue() < 2.5) {
            p = 4.198473282442748;
        } else if (true) {
            p = RepClassifier.N43793ba33547(i);
        }
        return p;
    }
    static double N43793ba33547(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 4.058974358974359;
        } else if (((Double)i[9]).doubleValue() < 3.5) {
            p = 3.977900552486188;
        } else if (true) {
            p = 4.1291866028708135;
        }
        return p;
    }
    static double N5b7219273548(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -0.2848657460323409;
        } else if (((Double)i[1]).doubleValue() < 6.5) {
            p = RepClassifier.N37837d243549(i);
        } else if (true) {
            p = RepClassifier.N6bf736ad3579(i);
        }
        return p;
    }
    static double N37837d243549(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -0.7159404745944496;
        } else if (((Double)i[2]).doubleValue() < 2.5) {
            p = RepClassifier.N74c670533550(i);
        } else if (true) {
            p = RepClassifier.N4be9ab3b3558(i);
        }
        return p;
    }
    static double N74c670533550(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 0.15198074787115884;
        } else if (((Double)i[1]).doubleValue() < 4.5) {
            p = RepClassifier.N7e68e94b3551(i);
        } else if (true) {
            p = RepClassifier.N5eddf2ca3554(i);
        }
        return p;
    }
    static double N7e68e94b3551(Object []i) {
        double p = Double.NaN;
    /* IS_TRUMP_SUIT */
        if (i[6] == null) {
            p = -0.1794238683127572;
        } else if (i[6].equals("X")) {
            p = RepClassifier.N35186c803552(i);
        } else if (i[6].equals("N")) {
            p = -0.46254071661237783;
        } else if (i[6].equals("Y")) {
            p = 0.296127562642369;
        }
        return p;
    }
    static double N35186c803552(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 0.04985337243401759;
        } else if (((Double)i[1]).doubleValue() < 3.5) {
            p = RepClassifier.N195e5d5a3553(i);
        } else if (true) {
            p = -0.11764705882352941;
        }
        return p;
    }
    static double N195e5d5a3553(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 0.08223972003499562;
        } else if (((Double)i[1]).doubleValue() < 2.5) {
            p = 0.18271954674220964;
        } else if (true) {
            p = -0.08009153318077804;
        }
        return p;
    }
    static double N5eddf2ca3554(Object []i) {
        double p = Double.NaN;
    /* IS_TRUMP_SUIT */
        if (i[6] == null) {
            p = 0.8394991462720547;
        } else if (i[6].equals("X")) {
            p = -0.416;
        } else if (i[6].equals("N")) {
            p = RepClassifier.N67467aeb3555(i);
        } else if (i[6].equals("Y")) {
            p = 3.272727272727273;
        }
        return p;
    }
    static double N67467aeb3555(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 0.919802590993214;
        } else if (((Double)i[9]).doubleValue() < 5.5) {
            p = 1.3577680525164113;
        } else if (true) {
            p = RepClassifier.N11cc66ef3556(i);
        }
        return p;
    }
    static double N11cc66ef3556(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 0.3536067892503536;
        } else if (((Double)i[9]).doubleValue() < 7.5) {
            p = RepClassifier.N7a934d013557(i);
        } else if (true) {
            p = -0.04411764705882353;
        }
        return p;
    }
    static double N7a934d013557(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 0.5149105367793241;
        } else if (((Double)i[9]).doubleValue() < 6.5) {
            p = 0.6666666666666666;
        } else if (true) {
            p = 0.3920863309352518;
        }
        return p;
    }
    static double N4be9ab3b3558(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -0.8629479823158687;
        } else if (((Double)i[9]).doubleValue() < 5.5) {
            p = RepClassifier.N1f2c118f3559(i);
        } else if (true) {
            p = RepClassifier.N1519ca7d3575(i);
        }
        return p;
    }
    static double N1f2c118f3559(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -0.7151027896185184;
        } else if (((Double)i[1]).doubleValue() < 4.5) {
            p = RepClassifier.N6d25f79b3560(i);
        } else if (true) {
            p = RepClassifier.N115fee773574(i);
        }
        return p;
    }
    static double N6d25f79b3560(Object []i) {
        double p = Double.NaN;
    /* IS_TRUMP_SUIT */
        if (i[6] == null) {
            p = -0.8845601149608814;
        } else if (i[6].equals("X")) {
            p = -0.8765565134099617;
        } else if (i[6].equals("N")) {
            p = RepClassifier.Nd3e547b3561(i);
        } else if (i[6].equals("Y")) {
            p = -0.5271614384085692;
        }
        return p;
    }
    static double Nd3e547b3561(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -1.0708057202650854;
        } else if (((Double)i[9]).doubleValue() < 2.5) {
            p = -0.8708487084870848;
        } else if (true) {
            p = RepClassifier.Nb8896943562(i);
        }
        return p;
    }
    static double Nb8896943562(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_ME */
        if (i[10] == null) {
            p = -1.0916795069337442;
        } else if (((Double)i[10]).doubleValue() < 0.5) {
            p = RepClassifier.N74575e033563(i);
        } else if (true) {
            p = RepClassifier.N26245cd53571(i);
        }
        return p;
    }
    static double N74575e033563(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -0.8692307692307693;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = RepClassifier.N360ce63d3564(i);
        } else if (true) {
            p = RepClassifier.N27c0f5be3569(i);
        }
        return p;
    }
    static double N360ce63d3564(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -0.7895622895622896;
        } else if (((Double)i[9]).doubleValue() < 4.5) {
            p = -0.9323529411764706;
        } else if (true) {
            p = RepClassifier.N496ee10b3565(i);
        }
        return p;
    }
    static double N496ee10b3565(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -0.5984251968503937;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = RepClassifier.N61de2843566(i);
        } else if (true) {
            p = RepClassifier.N487403023567(i);
        }
        return p;
    }
    static double N61de2843566(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -0.5538461538461539;
        } else if (((Double)i[1]).doubleValue() < 3.5) {
            p = -1.1714285714285715;
        } else if (true) {
            p = -0.3263157894736842;
        }
        return p;
    }
    static double N487403023567(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -0.6451612903225806;
        } else if (((Double)i[1]).doubleValue() < 3.5) {
            p = -0.15151515151515152;
        } else if (true) {
            p = RepClassifier.N1998293f3568(i);
        }
        return p;
    }
    static double N1998293f3568(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -0.8241758241758241;
        } else if (((Double)i[2]).doubleValue() < 5.5) {
            p = -0.5660377358490566;
        } else if (true) {
            p = -1.1842105263157894;
        }
        return p;
    }
    static double N27c0f5be3569(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -1.018987341772152;
        } else if (((Double)i[1]).doubleValue() < 3.5) {
            p = RepClassifier.N4e203a003570(i);
        } else if (true) {
            p = -1.0506329113924051;
        }
        return p;
    }
    static double N4e203a003570(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -0.9240506329113924;
        } else if (((Double)i[2]).doubleValue() < 7.5) {
            p = -0.21052631578947367;
        } else if (true) {
            p = -1.5853658536585367;
        }
        return p;
    }
    static double N26245cd53571(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -1.2117437722419928;
        } else if (((Double)i[1]).doubleValue() < 3.5) {
            p = RepClassifier.N7e2d48ff3572(i);
        } else if (true) {
            p = -1.8404255319148937;
        }
        return p;
    }
    static double N7e2d48ff3572(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -1.1746231155778895;
        } else if (((Double)i[1]).doubleValue() < 2.5) {
            p = RepClassifier.N5e602f813573(i);
        } else if (true) {
            p = -0.6136363636363636;
        }
        return p;
    }
    static double N5e602f813573(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.2253424657534246;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = -1.4524793388429753;
        } else if (true) {
            p = -1.1127049180327868;
        }
        return p;
    }
    static double N115fee773574(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -0.3617446312635259;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = 0.09575518262586377;
        } else if (true) {
            p = -0.5945742275810098;
        }
        return p;
    }
    static double N1519ca7d3575(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.0680389221556885;
        } else if (((Double)i[2]).doubleValue() < 5.5) {
            p = RepClassifier.N16712913576(i);
        } else if (true) {
            p = -1.0081362061172217;
        }
        return p;
    }
    static double N16712913576(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_ME */
        if (i[10] == null) {
            p = -1.1271753681392236;
        } else if (((Double)i[10]).doubleValue() < 0.5) {
            p = RepClassifier.N5e24291b3577(i);
        } else if (true) {
            p = -1.198749131341209;
        }
        return p;
    }
    static double N5e24291b3577(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.0736020806241873;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = RepClassifier.N306658fe3578(i);
        } else if (true) {
            p = -1.1932515337423313;
        }
        return p;
    }
    static double N306658fe3578(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -0.8213419563459984;
        } else if (((Double)i[9]).doubleValue() < 7.5) {
            p = -0.5180102915951973;
        } else if (true) {
            p = -1.091743119266055;
        }
        return p;
    }
    static double N6bf736ad3579(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 0.7153166604454398;
        } else if (((Double)i[9]).doubleValue() < 1.5) {
            p = RepClassifier.N523d42d83580(i);
        } else if (true) {
            p = RepClassifier.N4cda4fef3587(i);
        }
        return p;
    }
    static double N523d42d83580(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 2.7216377594540804;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = RepClassifier.N2d2ec5753581(i);
        } else if (true) {
            p = RepClassifier.N1e5016c43585(i);
        }
        return p;
    }
    static double N2d2ec5753581(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 3.475214805023133;
        } else if (((Double)i[2]).doubleValue() < 2.5) {
            p = RepClassifier.N2f8dd9863582(i);
        } else if (true) {
            p = RepClassifier.N7d9dd0843583(i);
        }
        return p;
    }
    static double N2f8dd9863582(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 4.056530214424951;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = 3.230088495575221;
        } else if (true) {
            p = 4.29;
        }
        return p;
    }
    static double N7d9dd0843583(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 3.177;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = 2.572972972972973;
        } else if (true) {
            p = RepClassifier.N458e666d3584(i);
        }
        return p;
    }
    static double N458e666d3584(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 3.3141104294478527;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = 3.4341463414634146;
        } else if (true) {
            p = 3.1925925925925926;
        }
        return p;
    }
    static double N1e5016c43585(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 2.1526946107784433;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = 1.8684931506849316;
        } else if (true) {
            p = RepClassifier.N5fd0bd613586(i);
        }
        return p;
    }
    static double N5fd0bd613586(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 2.2159853569249544;
        } else if (((Double)i[2]).doubleValue() < 5.5) {
            p = 2.3047619047619046;
        } else if (true) {
            p = 2.1853978671041836;
        }
        return p;
    }
    static double N4cda4fef3587(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 0.15338058453452258;
        } else if (((Double)i[2]).doubleValue() < 3.5) {
            p = RepClassifier.N7ad1e5173588(i);
        } else if (true) {
            p = RepClassifier.N3961f6f23600(i);
        }
        return p;
    }
    static double N7ad1e5173588(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 1.5939512741528983;
        } else if (((Double)i[2]).doubleValue() < 2.5) {
            p = RepClassifier.N64a93abf3589(i);
        } else if (true) {
            p = RepClassifier.N3aff288b3595(i);
        }
        return p;
    }
    static double N64a93abf3589(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 2.3000567214974477;
        } else if (((Double)i[9]).doubleValue() < 3.5) {
            p = RepClassifier.N3ec8a8fe3590(i);
        } else if (true) {
            p = RepClassifier.N557f9dbb3592(i);
        }
        return p;
    }
    static double N3ec8a8fe3590(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 2.7976973684210527;
        } else if (((Double)i[9]).doubleValue() < 2.5) {
            p = 3.1362940275650844;
        } else if (true) {
            p = RepClassifier.N20732dff3591(i);
        }
        return p;
    }
    static double N20732dff3591(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 2.4049733570159857;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = 2.172661870503597;
        } else if (true) {
            p = 2.6315789473684212;
        }
        return p;
    }
    static double N557f9dbb3592(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 1.193784277879342;
        } else if (((Double)i[9]).doubleValue() < 5.5) {
            p = RepClassifier.N78ae29693593(i);
        } else if (true) {
            p = 0.2653061224489796;
        }
        return p;
    }
    static double N78ae29693593(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 1.3964365256124722;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = RepClassifier.N3dae1da3594(i);
        } else if (true) {
            p = 0.7857142857142857;
        }
        return p;
    }
    static double N3dae1da3594(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 1.4834605597964376;
        } else if (((Double)i[9]).doubleValue() < 4.5) {
            p = 1.7011070110701108;
        } else if (true) {
            p = 1.0;
        }
        return p;
    }
    static double N3aff288b3595(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 0.9054203539823009;
        } else if (((Double)i[9]).doubleValue() < 3.5) {
            p = RepClassifier.N13c4f82a3596(i);
        } else if (true) {
            p = RepClassifier.N4ea888e43598(i);
        }
        return p;
    }
    static double N13c4f82a3596(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 1.289704708699122;
        } else if (((Double)i[9]).doubleValue() < 2.5) {
            p = 1.670043415340087;
        } else if (true) {
            p = RepClassifier.N1aa86e5a3597(i);
        }
        return p;
    }
    static double N1aa86e5a3597(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 0.8220640569395018;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = 1.1423611111111112;
        } else if (true) {
            p = 0.4854014598540146;
        }
        return p;
    }
    static double N4ea888e43598(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 0.03783783783783784;
        } else if (((Double)i[9]).doubleValue() < 4.5) {
            p = RepClassifier.Ndd05aca3599(i);
        } else if (true) {
            p = -0.4533333333333333;
        }
        return p;
    }
    static double Ndd05aca3599(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 0.37272727272727274;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = 0.4336917562724014;
        } else if (true) {
            p = 0.0392156862745098;
        }
        return p;
    }
    static double N3961f6f23600(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -0.41909637213443135;
        } else if (((Double)i[9]).doubleValue() < 2.5) {
            p = RepClassifier.N60e2853a3601(i);
        } else if (true) {
            p = RepClassifier.N6884f6c43609(i);
        }
        return p;
    }
    static double N60e2853a3601(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 0.10871545703006377;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = RepClassifier.N6a87de6a3602(i);
        } else if (true) {
            p = RepClassifier.N650edffa3603(i);
        }
        return p;
    }
    static double N6a87de6a3602(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 1.0708782742681047;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = 1.6536312849162011;
        } else if (true) {
            p = 0.8489361702127659;
        }
        return p;
    }
    static double N650edffa3603(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -0.12745839636913767;
        } else if (((Double)i[2]).doubleValue() < 7.5) {
            p = RepClassifier.N536e73cf3604(i);
        } else if (true) {
            p = RepClassifier.N40c31e9e3608(i);
        }
        return p;
    }
    static double N536e73cf3604(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = 0.08270676691729323;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = RepClassifier.N2751e7cd3605(i);
        } else if (true) {
            p = RepClassifier.N6013e9583607(i);
        }
        return p;
    }
    static double N2751e7cd3605(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 0.6293823038397329;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = RepClassifier.N737109c33606(i);
        } else if (true) {
            p = 0.3786407766990291;
        }
        return p;
    }
    static double N737109c33606(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = 0.7608142493638677;
        } else if (((Double)i[2]).doubleValue() < 5.5) {
            p = 0.6134020618556701;
        } else if (true) {
            p = 0.9045226130653267;
        }
        return p;
    }
    static double N6013e9583607(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -0.1518624641833811;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = -0.03556034482758621;
        } else if (true) {
            p = -0.38247863247863245;
        }
        return p;
    }
    static double N40c31e9e3608(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -0.773497688751926;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = -0.28061224489795916;
        } else if (true) {
            p = -0.986754966887417;
        }
        return p;
    }
    static double N6884f6c43609(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -0.7243983839803267;
        } else if (((Double)i[9]).doubleValue() < 4.5) {
            p = RepClassifier.N13c0d5063610(i);
        } else if (true) {
            p = RepClassifier.N249fb0353622(i);
        }
        return p;
    }
    static double N13c0d5063610(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -0.6139930252833479;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = RepClassifier.N6c66a70f3611(i);
        } else if (true) {
            p = RepClassifier.N7b7491603613(i);
        }
        return p;
    }
    static double N6c66a70f3611(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -0.10182207931404073;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = RepClassifier.N340963f33612(i);
        } else if (true) {
            p = -0.5755813953488372;
        }
        return p;
    }
    static double N340963f33612(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = 0.17487266553480474;
        } else if (((Double)i[9]).doubleValue() < 3.5) {
            p = 0.6082474226804123;
        } else if (true) {
            p = -0.2483221476510067;
        }
        return p;
    }
    static double N7b7491603613(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -0.7447332421340629;
        } else if (((Double)i[2]).doubleValue() < 7.5) {
            p = RepClassifier.N6e0903ed3614(i);
        } else if (true) {
            p = RepClassifier.N7245642b3619(i);
        }
        return p;
    }
    static double N6e0903ed3614(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -0.6694515074464221;
        } else if (((Double)i[2]).doubleValue() < 5.5) {
            p = RepClassifier.N378e9ffc3615(i);
        } else if (true) {
            p = RepClassifier.N486774053616(i);
        }
        return p;
    }
    static double N378e9ffc3615(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -0.43122270742358076;
        } else if (((Double)i[9]).doubleValue() < 3.5) {
            p = -0.3434343434343434;
        } else if (true) {
            p = -0.593167701863354;
        }
        return p;
    }
    static double N486774053616(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -0.7882416984213392;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = RepClassifier.N17c703f83617(i);
        } else if (true) {
            p = -0.948948948948949;
        }
        return p;
    }
    static double N17c703f83617(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -0.6968403074295474;
        } else if (((Double)i[2]).doubleValue() < 6.5) {
            p = -0.6112084063047285;
        } else if (true) {
            p = RepClassifier.N31776c863618(i);
        }
        return p;
    }
    static double N31776c863618(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -0.7783333333333333;
        } else if (((Double)i[9]).doubleValue() < 3.5) {
            p = -0.5849673202614379;
        } else if (true) {
            p = -0.9795918367346939;
        }
        return p;
    }
    static double N7245642b3619(Object []i) {
        double p = Double.NaN;
    /* TRUMP_SUIT_REMAINING_OTHER */
        if (i[9] == null) {
            p = -0.9745011086474501;
        } else if (((Double)i[9]).doubleValue() < 3.5) {
            p = RepClassifier.N171f13a3620(i);
        } else if (true) {
            p = RepClassifier.N2e06fa2f3621(i);
        }
        return p;
    }
    static double N171f13a3620(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -0.924187725631769;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = -0.7178571428571429;
        } else if (true) {
            p = -1.135036496350365;
        }
        return p;
    }
    static double N2e06fa2f3621(Object []i) {
        double p = Double.NaN;
    /* ROUND_NUMBER */
        if (i[1] == null) {
            p = -1.0545977011494252;
        } else if (((Double)i[1]).doubleValue() < 7.5) {
            p = -1.1786941580756014;
        } else if (true) {
            p = -0.4210526315789473;
        }
        return p;
    }
    static double N249fb0353622(Object []i) {
        double p = Double.NaN;
    /* SUIT_ORDER */
        if (i[2] == null) {
            p = -1.1828054298642534;
        } else if (((Double)i[2]).doubleValue() < 4.5) {
            p = -0.7671232876712328;
        } else if (true) {
            p = -1.2855530474040633;
        }
        return p;
    }
}

