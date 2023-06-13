.class public final LWC8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LBE8;

.field public final b:LxH8;


# direct methods
.method public synthetic constructor <init>(LAC8;LLC8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LAC8;->d(LAC8;)LBE8;

    move-result-object p2

    iput-object p2, p0, LWC8;->a:LBE8;

    invoke-static {p1}, LAC8;->e(LAC8;)LxH8;

    move-result-object p1

    iput-object p1, p0, LWC8;->b:LxH8;

    return-void
.end method


# virtual methods
.method public final a()LBE8;
    .locals 1
    .annotation build LHR7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LWC8;->a:LBE8;

    return-object v0
.end method

.method public final b()LxH8;
    .locals 1
    .annotation build LHR7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, LWC8;->b:LxH8;

    return-object v0
.end method
