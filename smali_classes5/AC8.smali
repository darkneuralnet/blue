.class public final LAC8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LBE8;

.field public b:LxH8;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic d(LAC8;)LBE8;
    .locals 0

    iget-object p0, p0, LAC8;->a:LBE8;

    return-object p0
.end method

.method public static bridge synthetic e(LAC8;)LxH8;
    .locals 0

    iget-object p0, p0, LAC8;->b:LxH8;

    return-object p0
.end method


# virtual methods
.method public final a(LxH8;)LAC8;
    .locals 0

    iput-object p1, p0, LAC8;->b:LxH8;

    return-object p0
.end method

.method public final b(LBE8;)LAC8;
    .locals 0

    iput-object p1, p0, LAC8;->a:LBE8;

    return-object p0
.end method

.method public final c()LWC8;
    .locals 2

    new-instance v0, LWC8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LWC8;-><init>(LAC8;LLC8;)V

    return-object v0
.end method
