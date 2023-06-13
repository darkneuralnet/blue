.class public final LPZ7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb1;


# static fields
.field public static final d:LOd3;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Ljava/util/Map;

.field public final c:LOd3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, LBZ7;->a:LBZ7;

    sput-object v0, LPZ7;->d:LOd3;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LPZ7;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LPZ7;->b:Ljava/util/Map;

    sget-object v0, LPZ7;->d:LOd3;

    iput-object v0, p0, LPZ7;->c:LOd3;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Class;LOd3;)Ltb1;
    .locals 1

    iget-object v0, p0, LPZ7;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, LPZ7;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final b()Ld08;
    .locals 4

    new-instance v0, Ld08;

    new-instance v1, Ljava/util/HashMap;

    iget-object v2, p0, LPZ7;->a:Ljava/util/Map;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v2, Ljava/util/HashMap;

    iget-object v3, p0, LPZ7;->b:Ljava/util/Map;

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iget-object v3, p0, LPZ7;->c:LOd3;

    invoke-direct {v0, v1, v2, v3}, Ld08;-><init>(Ljava/util/Map;Ljava/util/Map;LOd3;)V

    return-object v0
.end method
