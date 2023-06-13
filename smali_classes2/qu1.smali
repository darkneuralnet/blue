.class public Lqu1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLj6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LLj6<",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lqu1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqu1;

    invoke-direct {v0}, Lqu1;-><init>()V

    sput-object v0, Lqu1;->a:Lqu1;

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

    invoke-virtual {p0, p1, p2}, Lqu1;->b(Ldj2;F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public b(Ldj2;F)Ljava/lang/Float;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1}, Lzj2;->g(Ldj2;)F

    move-result p1

    mul-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
