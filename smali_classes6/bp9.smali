.class public abstract Lbp9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lbp9;

.field public static final b:Lbp9;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lto9;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lto9;-><init>(Lpo9;)V

    sput-object v0, Lbp9;->a:Lbp9;

    new-instance v0, Lyo9;

    invoke-direct {v0, v1}, Lyo9;-><init>(Lpo9;)V

    sput-object v0, Lbp9;->b:Lbp9;

    return-void
.end method

.method public synthetic constructor <init>(Lpo9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()Lbp9;
    .locals 1

    sget-object v0, Lbp9;->a:Lbp9;

    return-object v0
.end method

.method public static e()Lbp9;
    .locals 1

    sget-object v0, Lbp9;->b:Lbp9;

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;J)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "J)",
            "Ljava/util/List<",
            "T",
            "L;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/Object;J)V
.end method

.method public abstract c(Ljava/lang/Object;Ljava/lang/Object;J)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "J)V"
        }
    .end annotation
.end method
