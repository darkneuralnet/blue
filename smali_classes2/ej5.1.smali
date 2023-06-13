.class public Lej5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLj6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LLj6<",
        "Ldj5;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lej5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lej5;

    invoke-direct {v0}, Lej5;-><init>()V

    sput-object v0, Lej5;->a:Lej5;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ldj2;F)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lej5;->b(Ldj2;F)Ldj5;

    move-result-object p1

    return-object p1
.end method

.method public b(Ldj2;F)Ldj5;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Ldj2;->q()Ldj2$b;

    move-result-object v0

    sget-object v1, Ldj2$b;->b:Ldj2$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ldj2;->b()V

    :cond_1
    invoke-virtual {p1}, Ldj2;->k()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {p1}, Ldj2;->k()D

    move-result-wide v2

    double-to-float v2, v2

    :goto_1
    invoke-virtual {p1}, Ldj2;->g()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Ldj2;->u()V

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ldj2;->d()V

    :cond_3
    new-instance p1, Ldj5;

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr v1, v0

    mul-float/2addr v1, p2

    div-float/2addr v2, v0

    mul-float/2addr v2, p2

    invoke-direct {p1, v1, v2}, Ldj5;-><init>(FF)V

    return-object p1
.end method
