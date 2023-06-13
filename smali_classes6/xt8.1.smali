.class public final synthetic Lxt8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUs0;


# static fields
.field public static final synthetic a:Lxt8;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lxt8;

    invoke-direct {v0}, Lxt8;-><init>()V

    sput-object v0, Lxt8;->a:Lxt8;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LOs0;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lhw4$a;

    const-class v1, LoF0;

    const-class v2, Lym8;

    invoke-interface {p1, v2}, LOs0;->d(Ljava/lang/Class;)LX94;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lhw4$a;-><init>(Ljava/lang/Class;LX94;)V

    return-object v0
.end method
