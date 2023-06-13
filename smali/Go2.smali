.class public final LGo2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B4\u0008\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R \u0010\u0016\u001a\u00020\u00128\u0006\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u000b\u0010\u0015R\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00180\u00178F\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0019\u0082\u0002\u000f\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006 "
    }
    d2 = {
        "LGo2;",
        "",
        "LKS0;",
        "index",
        "LEo2;",
        "a",
        "(I)LEo2;",
        "Lpo2;",
        "Lpo2;",
        "itemProvider",
        "LVn2;",
        "b",
        "LVn2;",
        "measureScope",
        "LCO2;",
        "c",
        "LCO2;",
        "measuredItemFactory",
        "Lkz0;",
        "d",
        "J",
        "()J",
        "childConstraints",
        "",
        "",
        "()Ljava/util/Map;",
        "keyToIndexMap",
        "constraints",
        "",
        "isVertical",
        "<init>",
        "(JZLpo2;LVn2;LCO2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lpo2;

.field public final b:LVn2;

.field public final c:LCO2;

.field public final d:J


# direct methods
.method public constructor <init>(JZLpo2;LVn2;LCO2;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, LGo2;->a:Lpo2;

    iput-object p5, p0, LGo2;->b:LVn2;

    iput-object p6, p0, LGo2;->c:LCO2;

    const/4 p4, 0x0

    const p5, 0x7fffffff

    if-eqz p3, :cond_0

    invoke-static {p1, p2}, Lkz0;->n(J)I

    move-result p6

    goto :goto_0

    :cond_0
    move p6, p5

    :goto_0
    const/4 v0, 0x0

    if-nez p3, :cond_1

    invoke-static {p1, p2}, Lkz0;->m(J)I

    move-result p1

    move p5, p1

    :cond_1
    const/4 v1, 0x5

    const/4 v2, 0x0

    move p1, p4

    move p2, p6

    move p3, v0

    move p4, p5

    move p5, v1

    move-object p6, v2

    invoke-static/range {p1 .. p6}, Lnz0;->b(IIIIILjava/lang/Object;)J

    move-result-wide p1

    iput-wide p1, p0, LGo2;->d:J

    return-void
.end method

.method public synthetic constructor <init>(JZLpo2;LVn2;LCO2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, LGo2;-><init>(JZLpo2;LVn2;LCO2;)V

    return-void
.end method


# virtual methods
.method public final a(I)LEo2;
    .locals 4

    iget-object v0, p0, LGo2;->a:Lpo2;

    invoke-interface {v0, p1}, LRn2;->c(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LGo2;->b:LVn2;

    iget-wide v2, p0, LGo2;->d:J

    invoke-interface {v1, p1, v2, v3}, LVn2;->M(IJ)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, LGo2;->c:LCO2;

    invoke-interface {v2, p1, v0, v1}, LCO2;->a(ILjava/lang/Object;Ljava/util/List;)LEo2;

    move-result-object p1

    return-object p1
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, LGo2;->d:J

    return-wide v0
.end method

.method public final c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LGo2;->a:Lpo2;

    invoke-interface {v0}, LRn2;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
