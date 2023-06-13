.class public final LH90;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LJ90;


# direct methods
.method public constructor <init>(LJ90;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH90;->a:LJ90;

    return-void
.end method

.method public static a(LJb0;)LH90;
    .locals 2

    instance-of v0, p0, LJ90;

    const-string v1, "CameraInfo doesn\'t contain Camera2 implementation."

    invoke-static {v0, v1}, LHZ3;->b(ZLjava/lang/Object;)V

    check-cast p0, LJ90;

    invoke-virtual {p0}, LJ90;->p()LH90;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LH90;->a:LJ90;

    invoke-virtual {v0}, LJ90;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
