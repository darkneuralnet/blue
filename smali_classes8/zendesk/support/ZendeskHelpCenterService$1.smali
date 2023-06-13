.class Lzendesk/support/ZendeskHelpCenterService$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LON4$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/support/ZendeskHelpCenterService;->getCategories(Ljava/util/Locale;LlI6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LON4$b<",
        "Lzendesk/support/CategoriesResponse;",
        "Ljava/util/List<",
        "Lzendesk/support/Category;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lzendesk/support/ZendeskHelpCenterService;


# direct methods
.method public constructor <init>(Lzendesk/support/ZendeskHelpCenterService;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/ZendeskHelpCenterService$1;->this$0:Lzendesk/support/ZendeskHelpCenterService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic extract(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzendesk/support/CategoriesResponse;

    invoke-virtual {p0, p1}, Lzendesk/support/ZendeskHelpCenterService$1;->extract(Lzendesk/support/CategoriesResponse;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public extract(Lzendesk/support/CategoriesResponse;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/support/CategoriesResponse;",
            ")",
            "Ljava/util/List<",
            "Lzendesk/support/Category;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lzendesk/support/CategoriesResponse;->getCategories()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
