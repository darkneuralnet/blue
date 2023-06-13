.class public abstract Lp56;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lp56;


# instance fields
.field public final a:Lp56;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LWA5;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LWA5;-><init>(Lp56;II)V

    sput-object v0, Lp56;->b:Lp56;

    return-void
.end method

.method public constructor <init>(Lp56;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp56;->a:Lp56;

    return-void
.end method


# virtual methods
.method public final a(II)Lp56;
    .locals 1

    new-instance v0, LWA5;

    invoke-direct {v0, p0, p1, p2}, LWA5;-><init>(Lp56;II)V

    return-object v0
.end method

.method public final b(II)Lp56;
    .locals 1

    new-instance v0, LVG;

    invoke-direct {v0, p0, p1, p2}, LVG;-><init>(Lp56;II)V

    return-object v0
.end method

.method public abstract c(LCT;[B)V
.end method

.method public final d()Lp56;
    .locals 1

    iget-object v0, p0, Lp56;->a:Lp56;

    return-object v0
.end method
