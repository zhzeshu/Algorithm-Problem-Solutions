public class IntroToBioinformaticsArmory {
  public static void main( String[] args ) {
    String s = "AAACGGATCTCGAGCCGCACGGGCGGTCCCCACGAGCAAGCCACGGAGTTTAAGGGGCGCCTCGGTCGCACCTTGCTCCGTAGCCAAGGCTAATGCAATGTCATTCTTTCTCGCAAGCAATACTGTGATAGCCGGTACGTTACACATTTGTTAATCCATACTCTGGCTTACAAGCACAGTCAGCTTAAATCGGTAGACTTACGTTGTCCATGTACCCGGATTAGCGGCGTTCCTAGCTTGGGGAATGACGATATAAGCACATAGGAGCTATTCTGCATGGCGTAGCGATCGTTATTAGTACTCCGGCGCTGACTTCCTATAATCAAGGACTCTTTAAGCTAAAATACTCAGCTCTACCTGAGACGAAACTGGAATTGACGTTGTCGCGACGCGTTTATGACATACCCGTTTATAAGATCCTTTACGTCCGACGCAGCACATGCCTCCACGCAGAAAGGCACTGTACGGCGGGTTGTTGCGCTCACGAATTAAACTTTACAGCCATAGAATTATCATTTTCACAGCCTCAACCGGATATGCGTATTCTGCTAGACACTTCACAATATACCTCGGCATCTAAGCTTGATTTGTGAGGCCAGACGATTTGTCTGGTGGAAGCTTTCGACCTCAGGGGGCACCCGGGGTTTTTTCAGTCATGTATTATGGTTTTGAAATTACCAGCCATGGGCGCAAGCATTACTCAGTTACAGATAACGCCACCGAACCCCTGCTCCAGGTGGTACTCTCGGAACTTAAGAGTCTGTTCTTACGTACATCGATATTACACGTGTTAGCTTGGTTCATAAATTAGAGAATTCGAACGACATCGCTCCATAGC";
    int[] out = countNucleotides(s);
    for(int i = 0; i < 4; ++i) {
      System.out.print(out[i] + " ");
    }
  }
  public static int[] countNucleotides( String s ) {
    int[] counts = new int[4];
    for(int i = 0; i < s.length(); ++i) {
      switch(s.charAt(i)) {
        case 'A': ++counts[0]; break;
        case 'C': ++counts[1]; break;
        case 'G': ++counts[2]; break;
        case 'T': ++counts[3]; break;
      }
    }
    return counts;
  }
}