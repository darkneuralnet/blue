.class public final synthetic LuR7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# static fields
.field public static final synthetic a:LuR7;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LuR7;

    invoke-direct {v0}, LuR7;-><init>()V

    sput-object v0, LuR7;->a:LuR7;

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

    invoke-static {p1, p2}, LJR7;->k(Ljava/util/Map$Entry;LPd3;)V

    return-void
.end method
