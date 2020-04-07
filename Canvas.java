class Canvas {

    String id
    double x,y;
    String boja;
    List<Points>points=new ArrayList();

    public Point(String id, double x, double y, String boja) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.boja = boja;
    }

    public void dodadiBoja(Points point) {
        this.points.add(point);
    }

    public void PrintanjeTochki(Points point){
        for(Points p:point){
            System.out.println(point.getId()+"= ("+point.getX+", "+point.getY+")");
        }
    }

}