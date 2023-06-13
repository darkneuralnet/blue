.class public LGk2$a;
.super LGk2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGk2;->a(LGk2$b;Ljava/lang/Class;Ljava/lang/Class;)LGk2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LGk2<",
        "TKeyT;TSerializationT;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:LGk2$b;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;LGk2$b;)V
    .locals 0

    iput-object p3, p0, LGk2$a;->c:LGk2$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, LGk2;-><init>(Ljava/lang/Class;Ljava/lang/Class;LGk2$a;)V

    return-void
.end method
