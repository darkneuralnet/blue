.class public final Lx84;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw84;


# instance fields
.field public final a:Ly84;


# direct methods
.method public constructor <init>(Ly84;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx84;->a:Ly84;

    return-void
.end method

.method public static b(Ly84;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly84;",
            ")",
            "LY94<",
            "Lw84;",
            ">;"
        }
    .end annotation

    new-instance v0, Lx84;

    invoke-direct {v0, p0}, Lx84;-><init>(Ly84;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroid/view/View;)Lv84;
    .locals 1

    iget-object v0, p0, Lx84;->a:Ly84;

    invoke-virtual {v0, p1}, Ly84;->b(Landroid/view/View;)Lv84;

    move-result-object p1

    return-object p1
.end method
