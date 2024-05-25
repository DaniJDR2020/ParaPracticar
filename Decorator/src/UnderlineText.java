public class UnderlineText extends TextDecorator{
    public UnderlineText(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String render() {
        return "<u>" + super.render() + "</u>";
    }
}
