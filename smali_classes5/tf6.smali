.class public final synthetic Ltf6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBX5$a;


# instance fields
.field public final synthetic a:Lyf6;

.field public final synthetic b:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lyf6;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltf6;->a:Lyf6;

    iput-object p2, p0, Ltf6;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltf6;->a:Lyf6;

    iget-object v1, p0, Ltf6;->b:Ljava/util/Map;

    invoke-static {v0, v1}, Lyf6;->c(Lyf6;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
