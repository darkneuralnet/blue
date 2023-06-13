.class public final synthetic LJe8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUs0;


# static fields
.field public static final synthetic a:LJe8;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LJe8;

    invoke-direct {v0}, LJe8;-><init>()V

    sput-object v0, LJe8;->a:LJe8;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LOs0;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lel0;

    const-class v1, LPj0;

    invoke-interface {p1, v1}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LPj0;

    invoke-direct {v0, p1}, Lel0;-><init>(LPj0;)V

    return-object v0
.end method
