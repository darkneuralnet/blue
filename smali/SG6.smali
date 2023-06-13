.class public final synthetic LSG6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LaD6;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lai3;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:LEG6;


# direct methods
.method public synthetic constructor <init>(LaD6;Ljava/lang/String;Lai3;Lkotlin/jvm/functions/Function0;LEG6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSG6;->b:LaD6;

    iput-object p2, p0, LSG6;->c:Ljava/lang/String;

    iput-object p3, p0, LSG6;->d:Lai3;

    iput-object p4, p0, LSG6;->e:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, LSG6;->f:LEG6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, LSG6;->b:LaD6;

    iget-object v1, p0, LSG6;->c:Ljava/lang/String;

    iget-object v2, p0, LSG6;->d:Lai3;

    iget-object v3, p0, LSG6;->e:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, LSG6;->f:LEG6;

    invoke-static {v0, v1, v2, v3, v4}, LUG6;->a(LaD6;Ljava/lang/String;Lai3;Lkotlin/jvm/functions/Function0;LEG6;)V

    return-void
.end method
