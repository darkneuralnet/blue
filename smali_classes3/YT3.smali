.class public final synthetic LYT3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:LZT3;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(LZT3;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYT3;->b:LZT3;

    iput p2, p0, LYT3;->c:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, LYT3;->b:LZT3;

    iget v1, p0, LYT3;->c:I

    invoke-static {v0, v1, p1}, LZT3;->o(LZT3;ILandroid/view/View;)V

    return-void
.end method
