/** a body of snake */
public interface IBody {
	// thisをcに連なるIBodyと見たとき一つ動かしてかえす
	public IBody move(CartPt c);
}
