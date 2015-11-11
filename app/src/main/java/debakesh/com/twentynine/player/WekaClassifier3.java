package debakesh.com.twentynine.player;

/**
 * Created by debarghy on 10/6/2015.
 */



class WekaClassifier3 {



        public static double classify(Object[] i)
                throws Exception {

            double p = Double.NaN;
            p = WekaClassifier3.N52a49524240(i);
            return p;
        }
        static double N52a49524240(Object []i) {
            double p = Double.NaN;
            if (i[8] == null) {
                p = 0;
            } else if (i[8].equals("Y")) {
                p = WekaClassifier3.N28e603be241(i);
            } else if (i[8].equals("X")) {
                p = WekaClassifier3.N3307ec05257(i);
            } else if (i[8].equals("N")) {
                p = WekaClassifier3.N62f5d607286(i);
            }
            return p;
        }
        static double N28e603be241(Object []i) {
            double p = Double.NaN;
            if (i[0] == null) {
                p = 0;
            } else if (((Double) i[0]).doubleValue() <= 3.0) {
                p = WekaClassifier3.N47b6f41c242(i);
            } else if (((Double) i[0]).doubleValue() > 3.0) {
                p = 0;
            }
            return p;
        }
        static double N47b6f41c242(Object []i) {
            double p = Double.NaN;
            if (i[5] == null) {
                p = 0;
            } else if (i[5].equals("N")) {
                p = WekaClassifier3.Nd08deab243(i);
            } else if (i[5].equals("Y")) {
                p = WekaClassifier3.N6db224f8253(i);
            }
            return p;
        }
        static double Nd08deab243(Object []i) {
            double p = Double.NaN;
            if (i[1] == null) {
                p = 0;
            } else if (((Double) i[1]).doubleValue() <= 7.0) {
                p = WekaClassifier3.N7bf3679b244(i);
            } else if (((Double) i[1]).doubleValue() > 7.0) {
                p = WekaClassifier3.N63575da4252(i);
            }
            return p;
        }
        static double N7bf3679b244(Object []i) {
            double p = Double.NaN;
            if (i[4] == null) {
                p = 0;
            } else if (i[4].equals("YES")) {
                p = WekaClassifier3.N631070a8245(i);
            } else if (i[4].equals("NO")) {
                p = WekaClassifier3.N581ace38249(i);
            }
            return p;
        }
        static double N631070a8245(Object []i) {
            double p = Double.NaN;
            if (i[2] == null) {
                p = 0;
            } else if (((Double) i[2]).doubleValue() <= 3.0) {
                p = 0;
            } else if (((Double) i[2]).doubleValue() > 3.0) {
                p = WekaClassifier3.N13f66ec2246(i);
            }
            return p;
        }
        static double N13f66ec2246(Object []i) {
            double p = Double.NaN;
            if (i[3] == null) {
                p = 1;
            } else if (((Double) i[3]).doubleValue() <= 0.0) {
                p = 1;
            } else if (((Double) i[3]).doubleValue() > 0.0) {
                p = WekaClassifier3.N58401791247(i);
            }
            return p;
        }
        static double N58401791247(Object []i) {
            double p = Double.NaN;
            if (i[6] == null) {
                p = 1;
            } else if (i[6].equals("X")) {
                p = 1;
            } else if (i[6].equals("N")) {
                p = WekaClassifier3.N38ef6cbd248(i);
            } else if (i[6].equals("Y")) {
                p = 0;
            }
            return p;
        }
        static double N38ef6cbd248(Object []i) {
            double p = Double.NaN;
            if (i[10] == null) {
                p = 0;
            } else if (((Double) i[10]).doubleValue() <= 3.0) {
                p = 0;
            } else if (((Double) i[10]).doubleValue() > 3.0) {
                p = 1;
            }
            return p;
        }
        static double N581ace38249(Object []i) {
            double p = Double.NaN;
            if (i[7] == null) {
                p = 0;
            } else if (i[7].equals("Y")) {
                p = WekaClassifier3.N783a3b87250(i);
            } else if (i[7].equals("N")) {
                p = 0;
            }
            return p;
        }
        static double N783a3b87250(Object []i) {
            double p = Double.NaN;
            if (i[13] == null) {
                p = 0;
            } else if (((Double) i[13]).doubleValue() <= 2.0) {
                p = WekaClassifier3.N209e478e251(i);
            } else if (((Double) i[13]).doubleValue() > 2.0) {
                p = 0;
            }
            return p;
        }
        static double N209e478e251(Object []i) {
            double p = Double.NaN;
            if (i[1] == null) {
                p = 1;
            } else if (((Double) i[1]).doubleValue() <= 4.0) {
                p = 1;
            } else if (((Double) i[1]).doubleValue() > 4.0) {
                p = 0;
            }
            return p;
        }
        static double N63575da4252(Object []i) {
            double p = Double.NaN;
            if (i[4] == null) {
                p = 1;
            } else if (i[4].equals("YES")) {
                p = 1;
            } else if (i[4].equals("NO")) {
                p = 0;
            }
            return p;
        }
        static double N6db224f8253(Object []i) {
            double p = Double.NaN;
            if (i[13] == null) {
                p = 0;
            } else if (((Double) i[13]).doubleValue() <= 2.0) {
                p = WekaClassifier3.N447dccca254(i);
            } else if (((Double) i[13]).doubleValue() > 2.0) {
                p = 0;
            }
            return p;
        }
        static double N447dccca254(Object []i) {
            double p = Double.NaN;
            if (i[6] == null) {
                p = 0;
            } else if (i[6].equals("X")) {
                p = WekaClassifier3.N168d51fc255(i);
            } else if (i[6].equals("N")) {
                p = WekaClassifier3.N4f6e94f4256(i);
            } else if (i[6].equals("Y")) {
                p = 0;
            }
            return p;
        }
        static double N168d51fc255(Object []i) {
            double p = Double.NaN;
            if (i[1] == null) {
                p = 1;
            } else if (((Double) i[1]).doubleValue() <= 3.0) {
                p = 1;
            } else if (((Double) i[1]).doubleValue() > 3.0) {
                p = 0;
            }
            return p;
        }
        static double N4f6e94f4256(Object []i) {
            double p = Double.NaN;
            if (i[1] == null) {
                p = 1;
            } else if (((Double) i[1]).doubleValue() <= 4.0) {
                p = 1;
            } else if (((Double) i[1]).doubleValue() > 4.0) {
                p = 0;
            }
            return p;
        }
        static double N3307ec05257(Object []i) {
            double p = Double.NaN;
            if (i[3] == null) {
                p = 1;
            } else if (((Double) i[3]).doubleValue() <= 1.0) {
                p = WekaClassifier3.N19b67d33258(i);
            } else if (((Double) i[3]).doubleValue() > 1.0) {
                p = WekaClassifier3.N1f71479a281(i);
            }
            return p;
        }
        static double N19b67d33258(Object []i) {
            double p = Double.NaN;
            if (i[1] == null) {
                p = 1;
            } else if (((Double) i[1]).doubleValue() <= 6.0) {
                p = WekaClassifier3.N65c8cd48259(i);
            } else if (((Double) i[1]).doubleValue() > 6.0) {
                p = WekaClassifier3.N73a1eff2275(i);
            }
            return p;
        }
        static double N65c8cd48259(Object []i) {
            double p = Double.NaN;
            if (i[3] == null) {
                p = 1;
            } else if (((Double) i[3]).doubleValue() <= 0.0) {
                p = WekaClassifier3.N5e3a3c31260(i);
            } else if (((Double) i[3]).doubleValue() > 0.0) {
                p = WekaClassifier3.Nadf360e265(i);
            }
            return p;
        }
        static double N5e3a3c31260(Object []i) {
            double p = Double.NaN;
            if (i[1] == null) {
                p = 1;
            } else if (((Double) i[1]).doubleValue() <= 5.0) {
                p = 1;
            } else if (((Double) i[1]).doubleValue() > 5.0) {
                p = WekaClassifier3.N52d19437261(i);
            }
            return p;
        }
        static double N52d19437261(Object []i) {
            double p = Double.NaN;
            if (i[10] == null) {
                p = 1;
            } else if (((Double) i[10]).doubleValue() <= 3.0) {
                p = WekaClassifier3.N782434bb262(i);
            } else if (((Double) i[10]).doubleValue() > 3.0) {
                p = 1;
            }
            return p;
        }
        static double N782434bb262(Object []i) {
            double p = Double.NaN;
            if (i[10] == null) {
                p = 0;
            } else if (((Double) i[10]).doubleValue() <= 1.0) {
                p = 0;
            } else if (((Double) i[10]).doubleValue() > 1.0) {
                p = WekaClassifier3.N5ba5147a263(i);
            }
            return p;
        }
        static double N5ba5147a263(Object []i) {
            double p = Double.NaN;
            if (i[2] == null) {
                p = 0;
            } else if (((Double) i[2]).doubleValue() <= 6.0) {
                p = WekaClassifier3.N54f1708b264(i);
            } else if (((Double) i[2]).doubleValue() > 6.0) {
                p = 1;
            }
            return p;
        }
        static double N54f1708b264(Object []i) {
            double p = Double.NaN;
            if (i[10] == null) {
                p = 0;
            } else if (((Double) i[10]).doubleValue() <= 2.0) {
                p = 0;
            } else if (((Double) i[10]).doubleValue() > 2.0) {
                p = 1;
            }
            return p;
        }
        static double Nadf360e265(Object []i) {
            double p = Double.NaN;
            if (i[1] == null) {
                p = 1;
            } else if (((Double) i[1]).doubleValue() <= 5.0) {
                p = WekaClassifier3.N53074a02266(i);
            } else if (((Double) i[1]).doubleValue() > 5.0) {
                p = WekaClassifier3.N512a6b13271(i);
            }
            return p;
        }
        static double N53074a02266(Object []i) {
            double p = Double.NaN;
            if (i[2] == null) {
                p = 1;
            } else if (((Double) i[2]).doubleValue() <= 3.0) {
                p = WekaClassifier3.N207292dc267(i);
            } else if (((Double) i[2]).doubleValue() > 3.0) {
                p = 1;
            }
            return p;
        }
        static double N207292dc267(Object []i) {
            double p = Double.NaN;
            if (i[6] == null) {
                p = 1;
            } else if (i[6].equals("X")) {
                p = 1;
            } else if (i[6].equals("N")) {
                p = WekaClassifier3.N7f58db71268(i);
            } else if (i[6].equals("Y")) {
                p = WekaClassifier3.N65faf102270(i);
            }
            return p;
        }
        static double N7f58db71268(Object []i) {
            double p = Double.NaN;
            if (i[1] == null) {
                p = 1;
            } else if (((Double) i[1]).doubleValue() <= 4.0) {
                p = 1;
            } else if (((Double) i[1]).doubleValue() > 4.0) {
                p = WekaClassifier3.Nc44edd2269(i);
            }
            return p;
        }
        static double Nc44edd2269(Object []i) {
            double p = Double.NaN;
            if (i[9] == null) {
                p = 0;
            } else if (i[9].equals("OPPONENT")) {
                p = 0;
            } else if (i[9].equals("PARTNER")) {
                p = 1;
            } else if (i[9].equals("ME")) {
                p = 0;
            }
            return p;
        }
        static double N65faf102270(Object []i) {
            double p = Double.NaN;
            if (i[10] == null) {
                p = 1;
            } else if (((Double) i[10]).doubleValue() <= 4.0) {
                p = 1;
            } else if (((Double) i[10]).doubleValue() > 4.0) {
                p = 0;
            }
            return p;
        }
        static double N512a6b13271(Object []i) {
            double p = Double.NaN;
            if (i[10] == null) {
                p = 0;
            } else if (((Double) i[10]).doubleValue() <= 3.0) {
                p = 0;
            } else if (((Double) i[10]).doubleValue() > 3.0) {
                p = WekaClassifier3.N6890b114272(i);
            }
            return p;
        }
        static double N6890b114272(Object []i) {
            double p = Double.NaN;
            if (i[2] == null) {
                p = 0;
            } else if (((Double) i[2]).doubleValue() <= 3.0) {
                p = WekaClassifier3.N4311eba9273(i);
            } else if (((Double) i[2]).doubleValue() > 3.0) {
                p = 1;
            }
            return p;
        }
        static double N4311eba9273(Object []i) {
            double p = Double.NaN;
            if (i[9] == null) {
                p = 0;
            } else if (i[9].equals("OPPONENT")) {
                p = 0;
            } else if (i[9].equals("PARTNER")) {
                p = WekaClassifier3.N71d16028274(i);
            } else if (i[9].equals("ME")) {
                p = 1;
            }
            return p;
        }
        static double N71d16028274(Object []i) {
            double p = Double.NaN;
            if (i[10] == null) {
                p = 0;
            } else if (((Double) i[10]).doubleValue() <= 5.0) {
                p = 0;
            } else if (((Double) i[10]).doubleValue() > 5.0) {
                p = 1;
            }
            return p;
        }
        static double N73a1eff2275(Object []i) {
            double p = Double.NaN;
            if (i[10] == null) {
                p = 0;
            } else if (((Double) i[10]).doubleValue() <= 1.0) {
                p = 0;
            } else if (((Double) i[10]).doubleValue() > 1.0) {
                p = WekaClassifier3.N1e54e883276(i);
            }
            return p;
        }
        static double N1e54e883276(Object []i) {
            double p = Double.NaN;
            if (i[3] == null) {
                p = 1;
            } else if (((Double) i[3]).doubleValue() <= 0.0) {
                p = WekaClassifier3.N52541443277(i);
            } else if (((Double) i[3]).doubleValue() > 0.0) {
                p = WekaClassifier3.N6df5b06b280(i);
            }
            return p;
        }
        static double N52541443277(Object []i) {
            double p = Double.NaN;
            if (i[10] == null) {
                p = 0;
            } else if (((Double) i[10]).doubleValue() <= 2.0) {
                p = WekaClassifier3.N287efe01278(i);
            } else if (((Double) i[10]).doubleValue() > 2.0) {
                p = 1;
            }
            return p;
        }
        static double N287efe01278(Object []i) {
            double p = Double.NaN;
            if (i[2] == null) {
                p = 0;
            } else if (((Double) i[2]).doubleValue() <= 6.0) {
                p = 0;
            } else if (((Double) i[2]).doubleValue() > 6.0) {
                p = WekaClassifier3.N54dc5a83279(i);
            }
            return p;
        }
        static double N54dc5a83279(Object []i) {
            double p = Double.NaN;
            if (i[1] == null) {
                p = 0;
            } else if (((Double) i[1]).doubleValue() <= 7.0) {
                p = 0;
            } else if (((Double) i[1]).doubleValue() > 7.0) {
                p = 1;
            }
            return p;
        }
        static double N6df5b06b280(Object []i) {
            double p = Double.NaN;
            if (i[10] == null) {
                p = 0;
            } else if (((Double) i[10]).doubleValue() <= 5.0) {
                p = 0;
            } else if (((Double) i[10]).doubleValue() > 5.0) {
                p = 1;
            }
            return p;
        }
        static double N1f71479a281(Object []i) {
            double p = Double.NaN;
            if (i[2] == null) {
                p = 0;
            } else if (((Double) i[2]).doubleValue() <= 1.0) {
                p = 0;
            } else if (((Double) i[2]).doubleValue() > 1.0) {
                p = WekaClassifier3.N40203c83282(i);
            }
            return p;
        }
        static double N40203c83282(Object []i) {
            double p = Double.NaN;
            if (i[10] == null) {
                p = 0;
            } else if (((Double) i[10]).doubleValue() <= 4.0) {
                p = WekaClassifier3.N769e6e46283(i);
            } else if (((Double) i[10]).doubleValue() > 4.0) {
                p = 0;
            }
            return p;
        }
        static double N769e6e46283(Object []i) {
            double p = Double.NaN;
            if (i[1] == null) {
                p = 0;
            } else if (((Double) i[1]).doubleValue() <= 5.0) {
                p = WekaClassifier3.N3628fe16284(i);
            } else if (((Double) i[1]).doubleValue() > 5.0) {
                p = 0;
            }
            return p;
        }
        static double N3628fe16284(Object []i) {
            double p = Double.NaN;
            if (i[6] == null) {
                p = 0;
            } else if (i[6].equals("X")) {
                p = 0;
            } else if (i[6].equals("N")) {
                p = WekaClassifier3.N23f032de285(i);
            } else if (i[6].equals("Y")) {
                p = 0;
            }
            return p;
        }
        static double N23f032de285(Object []i) {
            double p = Double.NaN;
            if (i[11] == null) {
                p = 1;
            } else if (((Double) i[11]).doubleValue() <= 2.0) {
                p = 1;
            } else if (((Double) i[11]).doubleValue() > 2.0) {
                p = 0;
            }
            return p;
        }
        static double N62f5d607286(Object []i) {
            double p = Double.NaN;
            if (i[4] == null) {
                p = 0;
            } else if (i[4].equals("YES")) {
                p = WekaClassifier3.N679c7841287(i);
            } else if (i[4].equals("NO")) {
                p = 1;
            }
            return p;
        }
        static double N679c7841287(Object []i) {
            double p = Double.NaN;
            if (i[0] == null) {
                p = 0;
            } else if (((Double) i[0]).doubleValue() <= 3.0) {
                p = WekaClassifier3.N16b5e2ea288(i);
            } else if (((Double) i[0]).doubleValue() > 3.0) {
                p = 0;
            }
            return p;
        }
        static double N16b5e2ea288(Object []i) {
            double p = Double.NaN;
            if (i[5] == null) {
                p = 0;
            } else if (i[5].equals("N")) {
                p = WekaClassifier3.N34715420289(i);
            } else if (i[5].equals("Y")) {
                p = 0;
            }
            return p;
        }
        static double N34715420289(Object []i) {
            double p = Double.NaN;
            if (i[0] == null) {
                p = 0;
            } else if (((Double) i[0]).doubleValue() <= 2.0) {
                p = WekaClassifier3.N7878f947290(i);
            } else if (((Double) i[0]).doubleValue() > 2.0) {
                p = WekaClassifier3.N7ca2d879291(i);
            }
            return p;
        }
        static double N7878f947290(Object []i) {
            double p = Double.NaN;
            if (i[1] == null) {
                p = 0;
            } else if (((Double) i[1]).doubleValue() <= 7.0) {
                p = 0;
            } else if (((Double) i[1]).doubleValue() > 7.0) {
                p = 1;
            }
            return p;
        }
        static double N7ca2d879291(Object []i) {
            double p = Double.NaN;
            if (i[2] == null) {
                p = 0;
            } else if (((Double) i[2]).doubleValue() <= 3.0) {
                p = 0;
            } else if (((Double) i[2]).doubleValue() > 3.0) {
                p = 1;
            }
            return p;
        }
    }