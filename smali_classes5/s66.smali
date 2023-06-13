.class public final synthetic Ls66;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lt66$a;

.field public final synthetic c:Lt66;


# direct methods
.method public synthetic constructor <init>(Lt66$a;Lt66;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls66;->b:Lt66$a;

    iput-object p2, p0, Ls66;->c:Lt66;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Ls66;->b:Lt66$a;

    iget-object v1, p0, Ls66;->c:Lt66;

    invoke-static {v0, v1, p1}, Lt66$a;->a(Lt66$a;Lt66;Landroid/view/View;)V

    return-void
.end method
