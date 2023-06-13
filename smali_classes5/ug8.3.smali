.class public abstract Lug8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lug8;

.field public static final b:Lug8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LPf8;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LPf8;-><init>(LBf8;)V

    sput-object v0, Lug8;->a:Lug8;

    new-instance v0, Lfg8;

    invoke-direct {v0, v1}, Lfg8;-><init>(LBf8;)V

    sput-object v0, Lug8;->b:Lug8;

    return-void
.end method

.method public synthetic constructor <init>(LBf8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lug8;
    .locals 1

    sget-object v0, Lug8;->a:Lug8;

    return-object v0
.end method

.method public static d()Lug8;
    .locals 1

    sget-object v0, Lug8;->b:Lug8;

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;J)V
.end method

.method public abstract b(Ljava/lang/Object;Ljava/lang/Object;J)V
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
