.class public final synthetic LlQ7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUs0;


# static fields
.field public static final synthetic a:LlQ7;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LlQ7;

    invoke-direct {v0}, LlQ7;-><init>()V

    sput-object v0, LlQ7;->a:LlQ7;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LOs0;)Ljava/lang/Object;
    .locals 1

    const-class v0, Lhw4$a;

    invoke-interface {p1, v0}, LOs0;->b(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p1

    new-instance v0, Lhw4;

    invoke-direct {v0, p1}, Lhw4;-><init>(Ljava/util/Set;)V

    return-object v0
.end method
