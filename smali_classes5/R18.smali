.class public final synthetic LR18;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# static fields
.field public static final synthetic a:LR18;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LR18;

    invoke-direct {v0}, LR18;-><init>()V

    sput-object v0, LR18;->a:LR18;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/Map$Entry;

    check-cast p2, LPd3;

    invoke-static {p1, p2}, Lf28;->k(Ljava/util/Map$Entry;LPd3;)V

    return-void
.end method
