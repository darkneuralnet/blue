.class public final Lim$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/t$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lim;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lcom/google/protobuf/t$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lim$b;

    invoke-direct {v0}, Lim$b;-><init>()V

    sput-object v0, Lim$b;->a:Lcom/google/protobuf/t$e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Z
    .locals 0

    invoke-static {p1}, Lim;->a(I)Lim;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
