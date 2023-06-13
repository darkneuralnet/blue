.class public final LJ28;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LJ28;


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LJ28;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LJ28;-><init>(Z)V

    sput-object v0, LJ28;->b:LJ28;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LJ28;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, LJ28;->a:Ljava/util/Map;

    return-void
.end method

.method public static a()LJ28;
    .locals 1

    sget-object v0, LJ28;->b:LJ28;

    return-object v0
.end method


# virtual methods
.method public final b(Ldj8;I)Lq78;
    .locals 2

    iget-object v0, p0, LJ28;->a:Ljava/util/Map;

    new-instance v1, Lw28;

    invoke-direct {v1, p1, p2}, Lw28;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq78;

    return-object p1
.end method
