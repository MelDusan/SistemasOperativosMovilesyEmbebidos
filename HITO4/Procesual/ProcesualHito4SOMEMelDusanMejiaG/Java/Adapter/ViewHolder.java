public class ViewHolder extends RecyclerView.ViewHolder {
    private RelativeLayout rlContainer;

    public RelativeLayout getRlContainer() {
        return rlContainer;
    }

    public CircleImageView getCircleImage() {
        return circleImage;
    }

    public TextView getTvImage() {
        return tvImage;
    }

    public Button getBtnListen(){
        return btnListen;
    }

    private CircleImageView circleImage;
    private TextView tvImage;
    private Button btnListen;

    public  ViewHolder(View itemView) {
        super(itemView);
        initializeComponents(itemView);
    }

    private void initializeComponents(View itemView){
        rlContainer = itemView.findViewById(R.id.rlListItem);
        circleImage = itemView.findViewById(R.id.circleImageViewItem);
        tvImage = itemView.findViewById(R.id.tvImage);
        btnListen = itemView.findViewById(R.id.buttonListen);
    }

}