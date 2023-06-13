.class public interface abstract LGb0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LiW1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, LiW1;->a(Ljava/lang/Object;)LiW1;

    move-result-object v0

    sput-object v0, LGb0;->a:LiW1;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LJb0;",
            ">;)",
            "Ljava/util/List<",
            "LJb0;",
            ">;"
        }
    .end annotation
.end method

.method public getIdentifier()LiW1;
    .locals 1

    sget-object v0, LGb0;->a:LiW1;

    return-object v0
.end method
