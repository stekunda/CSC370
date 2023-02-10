import java.util.Arrays;

public class Dirsort {
    public static void sort(String[] dirs) {
        for (int i = 0; i < dirs.length; i++) {
            int index = 0;
            int counter = -1;

            while (index >= 0) {
                counter++;
                index = dirs[i].indexOf("/", index);
                if (index != -1)
                    index++;
            }
            dirs[i] = Character.toString((char) counter) + dirs[i];
        }
        Arrays.sort(dirs);
        for (int i = 0; i < dirs.length; i++) {
            dirs[i] = dirs[i].substring(1);
        }
    }

    public static void main(String[] args) {
        // Running test case a from the prompt
        String[] a = { "/", "/usr/", "/usr/local/", "/usr/local/bin/", "/games/",
                "/games/snake/", "/homework/", "/temp/downloads/" };
        sort(a);
        System.out.print("a)    ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();

        // Running test case b from the prompt
        String[] b = { "/usr/", "/usr/local/", "/bin/", "/usr/local/bin/", "/usr/bin/",
                "/bin/local/", "/bin/local/" };
        sort(b);
        System.out.print("b)    ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + "  ");
        }
        System.out.println();

        // Running test case c from the prompt
        String[] c = { "/", "/a/", "/b/", "/c/", "/d/", "/e/", "/f/", "/g/" };
        sort(c);
        System.out.print("c)    ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + "  ");
        }
        System.out.println();

        // Running test case d from the prompt
        String[] d = { "/", "/a/", "/b/", "/c/", "/d/", "/e/", "/f/", "/g/", "/a/a/", "/b/g/c/",
                "/g/f/" };
        sort(d);
        System.out.print("d)    ");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + "  ");
        }
        System.out.println();

        // Running test case e from the prompt
        String[] e = { "/a/b/c/d/e/f/g/h/i/j/k/l/m/n/", "/o/p/q/r/s/t/u/v/w/x/y/z/" };
        sort(e);
        System.out.print("e)    ");
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + "  ");
        }
        System.out.println();

        // Running test case f from the prompt
        String[] f = { "/a/b/", "/ab/cd/", "/c/d/", "/a/b/c/", "/ab/c/d/",
                "/a/bc/d/", "/a/b/cd/" };
        sort(f);
        System.out.print("f)    ");
        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i] + "  ");
        }
        System.out.println();
    }
}