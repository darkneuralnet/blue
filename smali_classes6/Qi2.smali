.class public final LQi2;
.super Lyi2;
.source "SourceFile"


# static fields
.field public static final b:LQi2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LQi2;

    invoke-direct {v0}, LQi2;-><init>()V

    sput-object v0, LQi2;->b:LQi2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Lyi2;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, LQi2;

    return p1
.end method

.method public hashCode()I
    .locals 1

    const-class v0, LQi2;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
