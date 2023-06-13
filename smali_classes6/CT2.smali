.class public final LCT2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LCT2$a;
    }
.end annotation


# static fields
.field public static final b:LCT2;


# instance fields
.field public final a:LBT2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LCT2$a;

    invoke-direct {v0}, LCT2$a;-><init>()V

    invoke-virtual {v0}, LCT2$a;->a()LCT2;

    move-result-object v0

    sput-object v0, LCT2;->b:LCT2;

    return-void
.end method

.method public constructor <init>(LBT2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCT2;->a:LBT2;

    return-void
.end method

.method public static b()LCT2$a;
    .locals 1

    new-instance v0, LCT2$a;

    invoke-direct {v0}, LCT2$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()LBT2;
    .locals 1
    .annotation build LK94;
        tag = 0x1
    .end annotation

    iget-object v0, p0, LCT2;->a:LBT2;

    return-object v0
.end method

.method public c()[B
    .locals 1

    invoke-static {p0}, LD94;->a(Ljava/lang/Object;)[B

    move-result-object v0

    return-object v0
.end method
