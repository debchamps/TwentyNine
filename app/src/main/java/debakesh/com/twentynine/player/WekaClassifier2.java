package debakesh.com.twentynine.player;

/**
 * Created by debarghy on 10/15/2015.
 */
public class WekaClassifier2 {


        public static double classify(Object[] i)
                throws Exception {

            double p = Double.NaN;
            p = WekaClassifier2.N5f43fc7129(i);
            return p;
        }
        static double N5f43fc7129(Object []i) {
            double p = Double.NaN;
            if (i[8] == null) {
                p = 1;
            } else if (i[8].equals("X")) {
                p = WekaClassifier2.N5e1beeb7130(i);
            } else if (i[8].equals("N")) {
                p = WekaClassifier2.N48bc70e9149(i);
            } else if (i[8].equals("Y")) {
                p = WekaClassifier2.Nc524d46164(i);
            }
            return p;
        }
        static double N5e1beeb7130(Object []i) {
            double p = Double.NaN;
            if (i[3] == null) {
                p = 0;
            } else if (((Double) i[3]).doubleValue() <= 1.0) {
                p = WekaClassifier2.N36f4ee57131(i);
            } else if (((Double) i[3]).doubleValue() > 1.0) {
                p = WekaClassifier2.N64e3e3145(i);
            }
            return p;
        }
        static double N36f4ee57131(Object []i) {
            double p = Double.NaN;
            if (i[1] == null) {
                p = 0;
            } else if (((Double) i[1]).doubleValue() <= 6.0) {
                p = WekaClassifier2.Neb4103b132(i);
            } else if (((Double) i[1]).doubleValue() > 6.0) {
                p = WekaClassifier2.N416b8284139(i);
            }
            return p;
        }
        static double Neb4103b132(Object []i) {
            double p = Double.NaN;
            if (i[1] == null) {
                p = 0;
            } else if (((Double) i[1]).doubleValue() <= 4.0) {
                p = 0;
            } else if (((Double) i[1]).doubleValue() > 4.0) {
                p = WekaClassifier2.N2a9a0c2d133(i);
            }
            return p;
        }
        static double N2a9a0c2d133(Object []i) {
            double p = Double.NaN;
            if (i[2] == null) {
                p = 1;
            } else if (((Double) i[2]).doubleValue() <= 3.0) {
                p = WekaClassifier2.N2bf5219f134(i);
            } else if (((Double) i[2]).doubleValue() > 3.0) {
                p = WekaClassifier2.N3ae2e4e0135(i);
            }
            return p;
        }
        static double N2bf5219f134(Object []i) {
            double p = Double.NaN;
            if (i[9] == null) {
                p = 1;
            } else if (((Double) i[9]).doubleValue() <= 6.0) {
                p = 1;
            } else if (((Double) i[9]).doubleValue() > 6.0) {
                p = 0;
            }
            return p;
        }
        static double N3ae2e4e0135(Object []i) {
            double p = Double.NaN;
            if (i[2] == null) {
                p = 0;
            } else if (((Double) i[2]).doubleValue() <= 5.0) {
                p = WekaClassifier2.N14f91e4f136(i);
            } else if (((Double) i[2]).doubleValue() > 5.0) {
                p = 0;
            }
            return p;
        }
        static double N14f91e4f136(Object []i) {
            double p = Double.NaN;
            if (i[9] == null) {
                p = 1;
            } else if (((Double) i[9]).doubleValue() <= 3.0) {
                p = 1;
            } else if (((Double) i[9]).doubleValue() > 3.0) {
                p = WekaClassifier2.N6e788399137(i);
            }
            return p;
        }
        static double N6e788399137(Object []i) {
            double p = Double.NaN;
            if (i[1] == null) {
                p = 0;
            } else if (((Double) i[1]).doubleValue() <= 5.0) {
                p = 0;
            } else if (((Double) i[1]).doubleValue() > 5.0) {
                p = WekaClassifier2.N6c83ae10138(i);
            }
            return p;
        }
        static double N6c83ae10138(Object []i) {
            double p = Double.NaN;
            if (i[9] == null) {
                p = 1;
            } else if (((Double) i[9]).doubleValue() <= 4.0) {
                p = 1;
            } else if (((Double) i[9]).doubleValue() > 4.0) {
                p = 0;
            }
            return p;
        }
        static double N416b8284139(Object []i) {
            double p = Double.NaN;
            if (i[9] == null) {
                p = 1;
            } else if (((Double) i[9]).doubleValue() <= 1.0) {
                p = 1;
            } else if (((Double) i[9]).doubleValue() > 1.0) {
                p = WekaClassifier2.N1dbce780140(i);
            }
            return p;
        }
        static double N1dbce780140(Object []i) {
            double p = Double.NaN;
            if (i[3] == null) {
                p = 0;
            } else if (((Double) i[3]).doubleValue() <= 0.0) {
                p = WekaClassifier2.N3772dbe5141(i);
            } else if (((Double) i[3]).doubleValue() > 0.0) {
                p = 1;
            }
            return p;
        }
        static double N3772dbe5141(Object []i) {
            double p = Double.NaN;
            if (i[2] == null) {
                p = 1;
            } else if (((Double) i[2]).doubleValue() <= 6.0) {
                p = WekaClassifier2.N46f00035142(i);
            } else if (((Double) i[2]).doubleValue() > 6.0) {
                p = WekaClassifier2.N5b92d5cd143(i);
            }
            return p;
        }
        static double N46f00035142(Object []i) {
            double p = Double.NaN;
            if (i[9] == null) {
                p = 1;
            } else if (((Double) i[9]).doubleValue() <= 3.0) {
                p = 1;
            } else if (((Double) i[9]).doubleValue() > 3.0) {
                p = 0;
            }
            return p;
        }
        static double N5b92d5cd143(Object []i) {
            double p = Double.NaN;
            if (i[9] == null) {
                p = 0;
            } else if (((Double) i[9]).doubleValue() <= 2.0) {
                p = WekaClassifier2.N2168b9d8144(i);
            } else if (((Double) i[9]).doubleValue() > 2.0) {
                p = 0;
            }
            return p;
        }
        static double N2168b9d8144(Object []i) {
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
        static double N64e3e3145(Object []i) {
            double p = Double.NaN;
            if (i[2] == null) {
                p = 1;
            } else if (((Double) i[2]).doubleValue() <= 1.0) {
                p = 1;
            } else if (((Double) i[2]).doubleValue() > 1.0) {
                p = WekaClassifier2.N4653aa72146(i);
            }
            return p;
        }
        static double N4653aa72146(Object []i) {
            double p = Double.NaN;
            if (i[1] == null) {
                p = 0;
            } else if (((Double) i[1]).doubleValue() <= 2.0) {
                p = WekaClassifier2.Nba223c8147(i);
            } else if (((Double) i[1]).doubleValue() > 2.0) {
                p = 1;
            }
            return p;
        }
        static double Nba223c8147(Object []i) {
            double p = Double.NaN;
            if (i[6] == null) {
                p = 0;
            } else if (i[6].equals("Y")) {
                p = WekaClassifier2.N6f60ed1d148(i);
            } else if (i[6].equals("N")) {
                p = 0;
            } else if (i[6].equals("X")) {
                p = 0;
            }
            return p;
        }
        static double N6f60ed1d148(Object []i) {
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
        static double N48bc70e9149(Object []i) {
            double p = Double.NaN;
            if (i[4] == null) {
                p = 1;
            } else if (i[4].equals("YES")) {
                p = WekaClassifier2.N136743b6150(i);
            } else if (i[4].equals("NO")) {
                p = WekaClassifier2.N715a69d1159(i);
            }
            return p;
        }
        static double N136743b6150(Object []i) {
            double p = Double.NaN;
            if (i[5] == null) {
                p = 1;
            } else if (i[5].equals("N")) {
                p = WekaClassifier2.N9418e71151(i);
            } else if (i[5].equals("Y")) {
                p = 1;
            }
            return p;
        }
        static double N9418e71151(Object []i) {
            double p = Double.NaN;
            if (i[0] == null) {
                p = 1;
            } else if (((Double) i[0]).doubleValue() <= 3.0) {
                p = WekaClassifier2.N61a18241152(i);
            } else if (((Double) i[0]).doubleValue() > 3.0) {
                p = 1;
            }
            return p;
        }
        static double N61a18241152(Object []i) {
            double p = Double.NaN;
            if (i[3] == null) {
                p = 0;
            } else if (((Double) i[3]).doubleValue() <= 1.0) {
                p = WekaClassifier2.N4a319da4153(i);
            } else if (((Double) i[3]).doubleValue() > 1.0) {
                p = 1;
            }
            return p;
        }
        static double N4a319da4153(Object []i) {
            double p = Double.NaN;
            if (i[0] == null) {
                p = 1;
            } else if (((Double) i[0]).doubleValue() <= 2.0) {
                p = WekaClassifier2.N63e21da7154(i);
            } else if (((Double) i[0]).doubleValue() > 2.0) {
                p = WekaClassifier2.N66d535ac155(i);
            }
            return p;
        }
        static double N63e21da7154(Object []i) {
            double p = Double.NaN;
            if (i[12] == null) {
                p = 1;
            } else if (((Double) i[12]).doubleValue() <= 6.0) {
                p = 1;
            } else if (((Double) i[12]).doubleValue() > 6.0) {
                p = 0;
            }
            return p;
        }
        static double N66d535ac155(Object []i) {
            double p = Double.NaN;
            if (i[3] == null) {
                p = 0;
            } else if (((Double) i[3]).doubleValue() <= 0.0) {
                p = 0;
            } else if (((Double) i[3]).doubleValue() > 0.0) {
                p = WekaClassifier2.Nb8b10bd156(i);
            }
            return p;
        }
        static double Nb8b10bd156(Object []i) {
            double p = Double.NaN;
            if (i[1] == null) {
                p = 0;
            } else if (((Double) i[1]).doubleValue() <= 2.0) {
                p = 0;
            } else if (((Double) i[1]).doubleValue() > 2.0) {
                p = WekaClassifier2.N4d9170d5157(i);
            }
            return p;
        }
        static double N4d9170d5157(Object []i) {
            double p = Double.NaN;
            if (i[11] == null) {
                p = 0;
            } else if (((Double) i[11]).doubleValue() <= 1.0) {
                p = 0;
            } else if (((Double) i[11]).doubleValue() > 1.0) {
                p = WekaClassifier2.N3e6d43e5158(i);
            }
            return p;
        }
        static double N3e6d43e5158(Object []i) {
            double p = Double.NaN;
            if (i[12] == null) {
                p = 1;
            } else if (((Double) i[12]).doubleValue() <= 5.0) {
                p = 1;
            } else if (((Double) i[12]).doubleValue() > 5.0) {
                p = 0;
            }
            return p;
        }
        static double N715a69d1159(Object []i) {
            double p = Double.NaN;
            if (i[0] == null) {
                p = 0;
            } else if (((Double) i[0]).doubleValue() <= 2.0) {
                p = WekaClassifier2.N220791bf160(i);
            } else if (((Double) i[0]).doubleValue() > 2.0) {
                p = 0;
            }
            return p;
        }
        static double N220791bf160(Object []i) {
            double p = Double.NaN;
            if (i[5] == null) {
                p = 0;
            } else if (i[5].equals("N")) {
                p = WekaClassifier2.N64565af2161(i);
            } else if (i[5].equals("Y")) {
                p = 0;
            }
            return p;
        }
        static double N64565af2161(Object []i) {
            double p = Double.NaN;
            if (i[12] == null) {
                p = 0;
            } else if (((Double) i[12]).doubleValue() <= 6.0) {
                p = WekaClassifier2.N30704ff6162(i);
            } else if (((Double) i[12]).doubleValue() > 6.0) {
                p = 0;
            }
            return p;
        }
        static double N30704ff6162(Object []i) {
            double p = Double.NaN;
            if (i[6] == null) {
                p = 1;
            } else if (i[6].equals("Y")) {
                p = 1;
            } else if (i[6].equals("N")) {
                p = 0;
            } else if (i[6].equals("X")) {
                p = WekaClassifier2.N12c6bcc8163(i);
            }
            return p;
        }
        static double N12c6bcc8163(Object []i) {
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
        static double Nc524d46164(Object []i) {
            double p = Double.NaN;
            if (i[0] == null) {
                p = 1;
            } else if (((Double) i[0]).doubleValue() <= 3.0) {
                p = WekaClassifier2.N5a0517f4165(i);
            } else if (((Double) i[0]).doubleValue() > 3.0) {
                p = 1;
            }
            return p;
        }
        static double N5a0517f4165(Object []i) {
            double p = Double.NaN;
            if (i[5] == null) {
                p = 1;
            } else if (i[5].equals("N")) {
                p = WekaClassifier2.N68b8ecbd166(i);
            } else if (i[5].equals("Y")) {
                p = 1;
            }
            return p;
        }
        static double N68b8ecbd166(Object []i) {
            double p = Double.NaN;
            if (i[4] == null) {
                p = 0;
            } else if (i[4].equals("YES")) {
                p = WekaClassifier2.N4f3f2d9e167(i);
            } else if (i[4].equals("NO")) {
                p = WekaClassifier2.N204f414d172(i);
            }
            return p;
        }
        static double N4f3f2d9e167(Object []i) {
            double p = Double.NaN;
            if (i[2] == null) {
                p = 1;
            } else if (((Double) i[2]).doubleValue() <= 3.0) {
                p = WekaClassifier2.N51196142168(i);
            } else if (((Double) i[2]).doubleValue() > 3.0) {
                p = 0;
            }
            return p;
        }
        static double N51196142168(Object []i) {
            double p = Double.NaN;
            if (i[11] == null) {
                p = 0;
            } else if (((Double) i[11]).doubleValue() <= 1.0) {
                p = WekaClassifier2.N23d16622169(i);
            } else if (((Double) i[11]).doubleValue() > 1.0) {
                p = WekaClassifier2.Nc23bbe1170(i);
            }
            return p;
        }
        static double N23d16622169(Object []i) {
            double p = Double.NaN;
            if (i[2] == null) {
                p = 1;
            } else if (((Double) i[2]).doubleValue() <= 2.0) {
                p = 1;
            } else if (((Double) i[2]).doubleValue() > 2.0) {
                p = 0;
            }
            return p;
        }
        static double Nc23bbe1170(Object []i) {
            double p = Double.NaN;
            if (i[2] == null) {
                p = 1;
            } else if (((Double) i[2]).doubleValue() <= 2.0) {
                p = 1;
            } else if (((Double) i[2]).doubleValue() > 2.0) {
                p = WekaClassifier2.N3ac63426171(i);
            }
            return p;
        }
        static double N3ac63426171(Object []i) {
            double p = Double.NaN;
            if (i[1] == null) {
                p = 0;
            } else if (((Double) i[1]).doubleValue() <= 2.0) {
                p = 0;
            } else if (((Double) i[1]).doubleValue() > 2.0) {
                p = 1;
            }
            return p;
        }
        static double N204f414d172(Object []i) {
            double p = Double.NaN;
            if (i[12] == null) {
                p = 1;
            } else if (((Double) i[12]).doubleValue() <= 6.0) {
                p = 1;
            } else if (((Double) i[12]).doubleValue() > 6.0) {
                p = 0;
            }
            return p;
        }

}
