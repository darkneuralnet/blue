.class public LLE3$a;
.super LLE3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLE3;->a(LLE3$b;Ljava/lang/Class;Ljava/lang/Class;)LLE3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LLE3<",
        "TParametersT;TSerializationT;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:LLE3$b;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;LLE3$b;)V
    .locals 0

    iput-object p3, p0, LLE3$a;->c:LLE3$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, LLE3;-><init>(Ljava/lang/Class;Ljava/lang/Class;LLE3$a;)V

    return-void
.end method
