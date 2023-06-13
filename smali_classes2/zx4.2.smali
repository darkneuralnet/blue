.class public final synthetic Lzx4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lyx4$b;

.field public final synthetic c:Lc01;


# direct methods
.method public synthetic constructor <init>(Lyx4$b;Lc01;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzx4;->b:Lyx4$b;

    iput-object p2, p0, Lzx4;->c:Lc01;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lzx4;->b:Lyx4$b;

    iget-object v1, p0, Lzx4;->c:Lc01;

    invoke-static {v0, v1, p1}, Lyx4$b;->a(Lyx4$b;Lc01;Landroid/view/View;)V

    return-void
.end method
