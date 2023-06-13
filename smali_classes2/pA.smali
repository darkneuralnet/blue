.class public final synthetic LpA;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:LqA$a;

.field public final synthetic c:LqA;


# direct methods
.method public synthetic constructor <init>(LqA$a;LqA;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpA;->b:LqA$a;

    iput-object p2, p0, LpA;->c:LqA;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, LpA;->b:LqA$a;

    iget-object v1, p0, LpA;->c:LqA;

    invoke-static {v0, v1, p1}, LqA$a;->a(LqA$a;LqA;Landroid/view/View;)V

    return-void
.end method
