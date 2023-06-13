.class public interface abstract LZs0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LZs0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LYs0;

    invoke-direct {v0}, LYs0;-><init>()V

    sput-object v0, LZs0;->a:LZs0;

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/google/firebase/components/ComponentRegistrar;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/components/ComponentRegistrar;",
            ")",
            "Ljava/util/List<",
            "LEs0<",
            "*>;>;"
        }
    .end annotation
.end method
