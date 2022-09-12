package midleLevel;

public class Gold extends Member{
	
	Gold(int id,String name,int point){
		super(id,name,point);
	}

@Override
public double getBonus() {
	// TODO Auto-generated method stub
	return this.getPoint()*0.03;
	}
}
