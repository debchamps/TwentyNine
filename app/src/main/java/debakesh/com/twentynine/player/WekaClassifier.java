package debakesh.com.twentynine.player;

/**
 * Created by debarghy on 10/6/2015.
 */



class WekaClassifier {

    public static double classify(Object[] i)
            throws Exception {

        double p = Double.NaN;
        p = WekaClassifier.N18335c9068(i);
        return p;
    }
    static double N18335c9068(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (i[8].equals("N")) {
            p = WekaClassifier.N4adecfb69(i);
        } else if (i[8].equals("Y")) {
            p = WekaClassifier.N599d28aa84(i);
        } else if (i[8].equals("X")) {
            p = WekaClassifier.Nb53fdd2101(i);
        }
        return p;
    }
    static double N4adecfb69(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (i[4].equals("YES")) {
            p = WekaClassifier.N1e84a66870(i);
        } else if (i[4].equals("NO")) {
            p = 0;
        }
        return p;
    }
    static double N1e84a66870(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 3.0) {
            p = WekaClassifier.N5c8f3d8671(i);
        } else if (((Double) i[0]).doubleValue() > 3.0) {
            p = 1;
        }
        return p;
    }
    static double N5c8f3d8671(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (i[5].equals("N")) {
            p = WekaClassifier.N5e5a3d5b72(i);
        } else if (i[5].equals("Y")) {
            p = 1;
        }
        return p;
    }
    static double N5e5a3d5b72(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 1.0) {
            p = WekaClassifier.N35fbc85f73(i);
        } else if (((Double) i[3]).doubleValue() > 1.0) {
            p = WekaClassifier.N26340a7081(i);
        }
        return p;
    }
    static double N35fbc85f73(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 2.0) {
            p = WekaClassifier.Nef79f6e74(i);
        } else if (((Double) i[0]).doubleValue() > 2.0) {
            p = WekaClassifier.N597640c879(i);
        }
        return p;
    }
    static double Nef79f6e74(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 0.0) {
            p = WekaClassifier.N2bb1e03b75(i);
        } else if (((Double) i[3]).doubleValue() > 0.0) {
            p = WekaClassifier.N7de2d77778(i);
        }
        return p;
    }
    static double N2bb1e03b75(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (i[6].equals("X")) {
            p = WekaClassifier.N248ea0f376(i);
        } else if (i[6].equals("N")) {
            p = 1;
        } else if (i[6].equals("Y")) {
            p = 0;
        }
        return p;
    }
    static double N248ea0f376(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 5.0) {
            p = WekaClassifier.N4fdc2d0d77(i);
        } else if (((Double) i[12]).doubleValue() > 5.0) {
            p = 1;
        }
        return p;
    }
    static double N4fdc2d0d77(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 5.0) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 5.0) {
            p = 0;
        }
        return p;
    }
    static double N7de2d77778(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 7.0) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 7.0) {
            p = 0;
        }
        return p;
    }
    static double N597640c879(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 3.0) {
            p = WekaClassifier.N8aeea2d80(i);
        } else if (((Double) i[2]).doubleValue() > 3.0) {
            p = 0;
        }
        return p;
    }
    static double N8aeea2d80(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= 3.0) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > 3.0) {
            p = 1;
        }
        return p;
    }
    static double N26340a7081(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 7.0) {
            p = WekaClassifier.N4d8628ae82(i);
        } else if (((Double) i[1]).doubleValue() > 7.0) {
            p = 0;
        }
        return p;
    }
    static double N4d8628ae82(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 3.0) {
            p = WekaClassifier.N269d51d683(i);
        } else if (((Double) i[12]).doubleValue() > 3.0) {
            p = 1;
        }
        return p;
    }
    static double N269d51d683(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 4.0) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 4.0) {
            p = 1;
        }
        return p;
    }
    static double N599d28aa84(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 3.0) {
            p = WekaClassifier.N5ffcde6385(i);
        } else if (((Double) i[0]).doubleValue() > 3.0) {
            p = 1;
        }
        return p;
    }
    static double N5ffcde6385(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (i[5].equals("N")) {
            p = WekaClassifier.N23435e6a86(i);
        } else if (i[5].equals("Y")) {
            p = WekaClassifier.N3a7af26798(i);
        }
        return p;
    }
    static double N23435e6a86(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 7.0) {
            p = WekaClassifier.N6f9cb83587(i);
        } else if (((Double) i[1]).doubleValue() > 7.0) {
            p = WekaClassifier.N5cc9bcbc97(i);
        }
        return p;
    }
    static double N6f9cb83587(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (i[4].equals("YES")) {
            p = WekaClassifier.N5f74151488(i);
        } else if (i[4].equals("NO")) {
            p = WekaClassifier.N5a37920a93(i);
        }
        return p;
    }
    static double N5f74151488(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 3.0) {
            p = WekaClassifier.N6642d75f89(i);
        } else if (((Double) i[2]).doubleValue() > 3.0) {
            p = WekaClassifier.N559c333f91(i);
        }
        return p;
    }
    static double N6642d75f89(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 4.0) {
            p = WekaClassifier.N5f4b65f390(i);
        } else if (((Double) i[12]).doubleValue() > 4.0) {
            p = 1;
        }
        return p;
    }
    static double N5f4b65f390(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 5.0) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 5.0) {
            p = 1;
        }
        return p;
    }
    static double N559c333f91(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= 4.0) {
            p = WekaClassifier.N2abf502d92(i);
        } else if (((Double) i[12]).doubleValue() > 4.0) {
            p = 0;
        }
        return p;
    }
    static double N2abf502d92(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= 1.0) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > 1.0) {
            p = 1;
        }
        return p;
    }
    static double N5a37920a93(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 4.0) {
            p = WekaClassifier.N5ed7104294(i);
        } else if (((Double) i[12]).doubleValue() > 4.0) {
            p = 1;
        }
        return p;
    }
    static double N5ed7104294(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (i[6].equals("X")) {
            p = 0;
        } else if (i[6].equals("N")) {
            p = WekaClassifier.N6a66d56c95(i);
        } else if (i[6].equals("Y")) {
            p = 1;
        }
        return p;
    }
    static double N6a66d56c95(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 0.0) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > 0.0) {
            p = WekaClassifier.N3a08ce3596(i);
        }
        return p;
    }
    static double N3a08ce3596(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= 2.0) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > 2.0) {
            p = 1;
        }
        return p;
    }
    static double N5cc9bcbc97(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (i[4].equals("YES")) {
            p = 0;
        } else if (i[4].equals("NO")) {
            p = 1;
        }
        return p;
    }
    static double N3a7af26798(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 2.0) {
            p = WekaClassifier.N666b8df199(i);
        } else if (((Double) i[12]).doubleValue() > 2.0) {
            p = 1;
        }
        return p;
    }
    static double N666b8df199(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 4.0) {
            p = WekaClassifier.N1aee8e6f100(i);
        } else if (((Double) i[1]).doubleValue() > 4.0) {
            p = 1;
        }
        return p;
    }
    static double N1aee8e6f100(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (i[6].equals("X")) {
            p = 1;
        } else if (i[6].equals("N")) {
            p = 0;
        } else if (i[6].equals("Y")) {
            p = 1;
        }
        return p;
    }
    static double Nb53fdd2101(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= 1.0) {
            p = WekaClassifier.N6657cf15102(i);
        } else if (((Double) i[3]).doubleValue() > 1.0) {
            p = WekaClassifier.N57ffccb6125(i);
        }
        return p;
    }
    static double N6657cf15102(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 6.0) {
            p = WekaClassifier.N5ce9c22b103(i);
        } else if (((Double) i[1]).doubleValue() > 6.0) {
            p = WekaClassifier.N7f9fb384116(i);
        }
        return p;
    }
    static double N5ce9c22b103(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= 0.0) {
            p = WekaClassifier.N321ab22f104(i);
        } else if (((Double) i[3]).doubleValue() > 0.0) {
            p = WekaClassifier.N6c2e450e107(i);
        }
        return p;
    }
    static double N321ab22f104(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 5.0) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 5.0) {
            p = WekaClassifier.N26b374d3105(i);
        }
        return p;
    }
    static double N26b374d3105(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 2.0) {
            p = WekaClassifier.N7e442877106(i);
        } else if (((Double) i[9]).doubleValue() > 2.0) {
            p = 0;
        }
        return p;
    }
    static double N7e442877106(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (i[6].equals("X")) {
            p = 0;
        } else if (i[6].equals("N")) {
            p = 1;
        } else if (i[6].equals("Y")) {
            p = 0;
        }
        return p;
    }
    static double N6c2e450e107(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 5.0) {
            p = WekaClassifier.Nbc2196e108(i);
        } else if (((Double) i[1]).doubleValue() > 5.0) {
            p = WekaClassifier.N77722ca7114(i);
        }
        return p;
    }
    static double Nbc2196e108(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 3.0) {
            p = WekaClassifier.N36eaf129109(i);
        } else if (((Double) i[2]).doubleValue() > 3.0) {
            p = 0;
        }
        return p;
    }
    static double N36eaf129109(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (i[6].equals("X")) {
            p = 0;
        } else if (i[6].equals("N")) {
            p = WekaClassifier.N69b27013110(i);
        } else if (i[6].equals("Y")) {
            p = 1;
        }
        return p;
    }
    static double N69b27013110(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 0.0) {
            p = WekaClassifier.N772a5e1e111(i);
        } else if (((Double) i[10]).doubleValue() > 0.0) {
            p = 0;
        }
        return p;
    }
    static double N772a5e1e111(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 2.0) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 2.0) {
            p = WekaClassifier.N6cb830fc112(i);
        }
        return p;
    }
    static double N6cb830fc112(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 3.0) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 3.0) {
            p = WekaClassifier.Nd3af7fb113(i);
        }
        return p;
    }
    static double Nd3af7fb113(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 7.0) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 7.0) {
            p = 0;
        }
        return p;
    }
    static double N77722ca7114(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 2.0) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 2.0) {
            p = WekaClassifier.N528d56f9115(i);
        }
        return p;
    }
    static double N528d56f9115(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 3.0) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 3.0) {
            p = 0;
        }
        return p;
    }
    static double N7f9fb384116(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 1.0) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 1.0) {
            p = WekaClassifier.N25c016a3117(i);
        }
        return p;
    }
    static double N25c016a3117(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= 0.0) {
            p = WekaClassifier.N433101a8118(i);
        } else if (((Double) i[3]).doubleValue() > 0.0) {
            p = WekaClassifier.N5c625643121(i);
        }
        return p;
    }
    static double N433101a8118(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 2.0) {
            p = WekaClassifier.N7b33ada9119(i);
        } else if (((Double) i[9]).doubleValue() > 2.0) {
            p = 0;
        }
        return p;
    }
    static double N7b33ada9119(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 7.0) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 7.0) {
            p = WekaClassifier.N79b232d8120(i);
        }
        return p;
    }
    static double N79b232d8120(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 5.0) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 5.0) {
            p = 0;
        }
        return p;
    }
    static double N5c625643121(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 2.0) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 2.0) {
            p = WekaClassifier.N17952026122(i);
        }
        return p;
    }
    static double N17952026122(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 3.0) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 3.0) {
            p = WekaClassifier.N712d8998123(i);
        }
        return p;
    }
    static double N712d8998123(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 7.0) {
            p = WekaClassifier.N19615197124(i);
        } else if (((Double) i[1]).doubleValue() > 7.0) {
            p = 0;
        }
        return p;
    }
    static double N19615197124(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 5.0) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 5.0) {
            p = 0;
        }
        return p;
    }
    static double N57ffccb6125(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 4.0) {
            p = WekaClassifier.N6955427f126(i);
        } else if (((Double) i[9]).doubleValue() > 4.0) {
            p = 1;
        }
        return p;
    }
    static double N6955427f126(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -1.0) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -1.0) {
            p = WekaClassifier.N74296784127(i);
        }
        return p;
    }
    static double N74296784127(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 4.0) {
            p = WekaClassifier.N67d76d7f128(i);
        } else if (((Double) i[1]).doubleValue() > 4.0) {
            p = 1;
        }
        return p;
    }
    static double N67d76d7f128(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 1.0) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 1.0) {
            p = 1;
        }
        return p;
    }
}
