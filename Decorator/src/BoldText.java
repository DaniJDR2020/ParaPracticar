public class BoldText extends TextDecorator {
    public BoldText(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String render() {
        return "<b>" + super.render() + "</b>";
    }
}
