.class public final Lhy2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ldy2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy2;->a:LY94;

    iput-object p2, p0, Lhy2;->b:LY94;

    iput-object p3, p0, Lhy2;->c:LY94;

    iput-object p4, p0, Lhy2;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)Lhy2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)",
            "Lhy2;"
        }
    .end annotation

    new-instance v0, Lhy2;

    invoke-direct {v0, p0, p1, p2, p3}, Lhy2;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LEa;Landroid/content/Context;Le13;Lgl;)Ldy2;
    .locals 1

    new-instance v0, Ldy2;

    invoke-direct {v0, p0, p1, p2, p3}, Ldy2;-><init>(LEa;Landroid/content/Context;Le13;Lgl;)V

    return-object v0
.end method


# virtual methods
.method public b()Ldy2;
    .locals 4

    iget-object v0, p0, Lhy2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    iget-object v1, p0, Lhy2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lhy2;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le13;

    iget-object v3, p0, Lhy2;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgl;

    invoke-static {v0, v1, v2, v3}, Lhy2;->c(LEa;Landroid/content/Context;Le13;Lgl;)Ldy2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lhy2;->b()Ldy2;

    move-result-object v0

    return-object v0
.end method
