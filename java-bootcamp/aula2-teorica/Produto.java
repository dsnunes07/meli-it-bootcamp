class Produto {
  public String codigo;
  public String nome;
  public double preco;


  public String getCodigo() {
    return this.codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return this.preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  @Override
  public String toString() {
    return getCodigo() + "_" + getNome() + "-" + getPreco();
  }

  public static void main(String[] args) {
    Produto p = new Produto();
    p.codigo = "1";
    p.nome = "Macbook";
    p.preco = 10000;
    Produto q = p;
    p = null;
    int i = 0;
    while (i < 40) {
      System.out.println(q);
      i += 1;
    }
  }
}