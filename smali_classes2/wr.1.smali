.class public final Lwr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvr;


# instance fields
.field public final a:Lxr;


# direct methods
.method public constructor <init>(Lxr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwr;->a:Lxr;

    return-void
.end method

.method public static b(Lxr;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxr;",
            ")",
            "LY94<",
            "Lvr;",
            ">;"
        }
    .end annotation

    new-instance v0, Lwr;

    invoke-direct {v0, p0}, Lwr;-><init>(Lxr;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroidx/appcompat/app/AppCompatActivity;Le13;Lqs;)Ltr;
    .locals 1

    iget-object v0, p0, Lwr;->a:Lxr;

    invoke-virtual {v0, p1, p2, p3}, Lxr;->b(Landroidx/appcompat/app/AppCompatActivity;Le13;Lqs;)Ltr;

    move-result-object p1

    return-object p1
.end method
